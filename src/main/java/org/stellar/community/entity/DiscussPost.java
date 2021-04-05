package org.stellar.community.entity;

import lombok.Data;

import java.util.Date;

/**
 * @description: TODO <br>
 * @date: 2021/4/5 12:10 <br>
 * @author: yzy <br>
 * @version: 1.0 <br>
 */
@Data
public class DiscussPost {

    private int id;
    private int userId;
    private String title;
    private String content;
    private int type;
    private int status;
    private Date createTime;
    private int commentCount;
    private double score;
}
