package org.stellar.community.entity;

import lombok.Data;

import java.util.Date;

/**
 * @description: TODO <br>
 * @date: 2021/4/5 12:47 <br>
 * @author: yzy <br>
 * @version: 1.0 <br>
 */
@Data
public class User {

    private int id;
    private String username;
    private String password;
    private String salt;
    private String email;
    private int type;
    private int status;
    private String activationCode;
    private String headerUrl;
    private Date createTime;
}
