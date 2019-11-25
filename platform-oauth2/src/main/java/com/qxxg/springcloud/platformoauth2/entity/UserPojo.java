package com.qxxg.springcloud.platformoauth2.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author SmallSand
 * @Date 2019/11/4  15:29
 */
@Data
public class UserPojo implements Serializable {

    private Integer id;
    private String name;
    private String mobile;
    private String mail;
    private String pwd;

    public UserPojo() {
    }
}
