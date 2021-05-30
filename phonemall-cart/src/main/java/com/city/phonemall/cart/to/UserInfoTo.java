package com.city.phonemall.cart.to;

import lombok.Data;

import java.io.Serializable;

/**
 * @author liuZhongKun
 * @Description:
 * @email 1071607950@qq.com
 * @date 2021-05-30 08:47:33
 **/

@Data
public class UserInfoTo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long userId;

    private String userKey;

    /**
     * 是否临时用户
     */
    private Boolean tempUser = false;

}
