package org.stellar.community;

import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.stellar.community.dao.DiscussPostMapper;
import org.stellar.community.dao.UserMapper;
import org.stellar.community.entity.DiscussPost;
import org.stellar.community.entity.User;

import java.util.List;

/**
 * @description: TODO <br>
 * @date: 2021/4/5 13:00 <br>
 * @author: yzy <br>
 * @version: 1.0 <br>
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = CommunityApplication.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;
    
    @Autowired
    private DiscussPostMapper discussPostMapper;
    
    @Test
    public void testSelectById(){
        User user = userMapper.selectById(1);
        log.info("user:{}", user);
    }
    
    @Test
    public void testSelectPosts(){
        List<DiscussPost> discussPosts = discussPostMapper.selectDiscussPosts(149, 0, 10);
        for(DiscussPost post: discussPosts){
            System.out.println(post);
        }
        int rows = discussPostMapper.selectDiscussPostRows(149);
        System.out.println(rows);
    }
}
