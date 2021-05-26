package com.city.phonemall.member.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-04 13:09:33
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
