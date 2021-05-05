package com.city.phonemall.member.exception;

/**
 * @author liuZhongKun
 * @email 1071607950@qq.com
 * @date 2021-05-05 8:37:33
 **/
public class PhoneException extends RuntimeException {

    public PhoneException() {
        super("存在相同的手机号");
    }
}
