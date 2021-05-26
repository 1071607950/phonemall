package com.city.phonemall.member.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-04 13:09:33
 **/

@Data
public class MemberUserLoginVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String loginacct;

    private String password;

}
