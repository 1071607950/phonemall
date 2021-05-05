package com.city.phonemall.member.exception;

/**
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-05 8:37:33
 **/
public class UsernameException extends RuntimeException {


    public UsernameException() {
        super("存在相同的用户名");
    }
}
