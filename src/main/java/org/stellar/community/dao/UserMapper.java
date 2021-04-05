package org.stellar.community.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.stellar.community.entity.User;

/**
 * @description: TODO <br>
 * @date: 2021/4/5 12:50 <br>
 * @author: yzy <br>
 * @version: 1.0 <br>
 */
@Mapper
public interface UserMapper {
    User selectById(int id);
    
    User selectByName(String username);
    
    User selectByEmail(String email);
    
    int insertUser(User user);
    
    int updateStatus(int id, int status);
    
    int updateHeader(int id, String headerUrl);
    
    int updatePassword(int id, String password);
}
