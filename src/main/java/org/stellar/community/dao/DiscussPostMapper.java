package org.stellar.community.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.stellar.community.entity.DiscussPost;

import java.util.List;

/**
 * @description: TODO <br>
 * @date: 2021/4/5 12:38 <br>
 * @author: yzy <br>
 * @version: 1.0 <br>
 */
@Mapper
public interface DiscussPostMapper {

    /**
     * 分页查询帖子
     * @param userId 用户id,id为0时查询所有的帖子
     * @param offset 当前页码
     * @param limit 当前页显示的帖子个数
     * @return
     */
    List<DiscussPost> selectDiscussPosts(@Param("userId") int userId, @Param("offset") int offset, @Param("limit")int limit);

    /**
     * 查询用户的帖子数,id=0时,查询所有的帖子数
     * 注意:该方法只有一个参数且该参数用于sql的动态拼接(即在<if>里使用),这这个参数一定要取别名(如通过@Param),否则会报错
     * @param userId
     * @return
     */
    int selectDiscussPostRows(@Param("userId") int userId);
}
