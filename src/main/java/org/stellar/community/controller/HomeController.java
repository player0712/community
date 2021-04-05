package org.stellar.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.stellar.community.entity.DiscussPost;
import org.stellar.community.entity.Page;
import org.stellar.community.entity.User;
import org.stellar.community.service.DiscussPostService;
import org.stellar.community.service.UserService;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @description: TODO <br>
 * @date: 2021/4/5 14:21 <br>
 * @author: yzy <br>
 * @version: 1.0 <br>
 */
@Controller
public class HomeController {

    @Autowired
    private UserService userService;
    
    @Autowired
    private DiscussPostService discussPostService;
    
    @GetMapping("/index")
    public String getIndexPage(Model model, Page page){
        /**
         * 方法调用前,SpringMVC会自动实例化Model和Page,并将Page注入Model
         * 所以,在thymeleaf中可以直接访问Page对象中的数据
         */
        page.setRows(discussPostService.findDiscussPostRows(0));    
        page.setPath("/index");
        List<DiscussPost> discussPosts = discussPostService.findDiscussPosts(0, page.getOffset(), page.getLimit());
        
        List<Map<String, Object>> posts = new LinkedList<>();
        if(null != discussPosts){
            for(DiscussPost post: discussPosts){
                Map<String, Object> map = new HashMap<>();
                map.put("post", post);
                User userById = userService.findUserById(post.getUserId());
                map.put("user", userById);
                posts.add(map);
            }
        }
        model.addAttribute("discussPosts", posts);
        return "/index";
    }
}
