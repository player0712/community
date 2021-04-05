package org.stellar.community.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

/**
 * @description: 封装分页的信息 <br>
 * @date: 2021/4/5 14:48 <br>
 * @author: yzy <br>
 * @version: 1.0 <br>
 */
@Data
public class Page {

    /**
     * 当前页码
     */
    @Range(min = 1)
    private int current = 1;
    /**
     * 每页显示的上限
     */
    @Range(min = 1, max = 100)
    private int limit = 10;
    /**
     * 数据总数:用于计算总页数
     */
    @Range(min = 0)
    private int rows;

    /**
     * 查询路径:用于复用分页连接
     */
    private String path;

    /**
     * 获取当前页的起始行
     * 第一页起始行为0,第二页起始行为limit
     * @return
     */
    public int getOffset(){
        return (current - 1) * limit;
    }

    /**
     * 获取总页数
     * @return
     */
    public int getTotal(){
       return (rows % limit == 0 ? 0 : 1) + rows / limit; 
    }

    /**
     * 获取当前显示的最小页码
     * 页数太多,不可能全部显示,只显示当前页数附近的几页
     * @return
     */
    public int getFrom(){
        int from = current - 2;
        return Math.max(from, 1);
    }
    
    public int getTo(){
        int to = current + 2;
        int total = getTotal();
        return Math.min(to, total);
    }
}
