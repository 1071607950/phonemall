package com.city.phonemall.auth.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author liuZhongKun
 * @Description:
 * @email 1071607950@qq.com
 * @date 2021-05-24 09:47:33
 **/

@Data
public class UserLoginVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String loginacct;

    private String password;
}
