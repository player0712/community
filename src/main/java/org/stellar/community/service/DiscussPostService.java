package org.stellar.community.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.stellar.community.dao.DiscussPostMapper;
import org.stellar.community.entity.DiscussPost;

import java.util.List;

/**
 * @description: TODO <br>
 * @date: 2021/4/5 14:11 <br>
 * @author: yzy <br>
 * @version: 1.0 <br>
 */
@Service
public class DiscussPostService {

    @Autowired
    private DiscussPostMapper discussPostMapper;
    
    public List<DiscussPost> findDiscussPosts(int userId, int offset, int limit){
        return discussPostMapper.selectDiscussPosts(userId, offset, limit);
    }
    
    public int findDiscussPostRows(int userId){
        return discussPostMapper.selectDiscussPostRows(userId);
    }
        
}
