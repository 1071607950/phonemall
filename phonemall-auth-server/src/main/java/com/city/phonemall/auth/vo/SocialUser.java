package com.city.phonemall.auth.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author liuZhongKun
 * @Description: 社交用户信息
 * @email 1071607950@qq.com
 * @date 2021-05-24 09:47:33
 **/

@Data
public class SocialUser implements Serializable {
    private static final long serialVersionUID = 1L;
    private String access_token;

    private String remind_in;

    private long expires_in;

    private String uid;

    private String isRealName;

}
