package org.stellar.community.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.stellar.community.dao.UserMapper;
import org.stellar.community.entity.User;

/**
 * @description: TODO <br>
 * @date: 2021/4/5 14:15 <br>
 * @author: yzy <br>
 * @version: 1.0 <br>
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;
    
    public User findUserById(int userId){
        return userMapper.selectById(userId);
    }
}
