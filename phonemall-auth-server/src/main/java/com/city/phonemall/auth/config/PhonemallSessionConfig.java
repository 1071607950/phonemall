package com.city.phonemall.auth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;


/**
 * @author liuZhongKun
 * @Description: springSession配置类
 * @email 1071607950@qq.com
 * @date 2021-05-24 09:47:33
 **/

@Configuration
public class PhonemallSessionConfig {

    //TODO 还没实现
    /*@Bean
    public CookieSerializer cookieSerializer() {

        DefaultCookieSerializer cookieSerializer = new DefaultCookieSerializer();

        //放大作用域
        cookieSerializer.setDomainName("phonemall.com");
        cookieSerializer.setCookieName("GULISESSION");

        return cookieSerializer;
    }*/


    @Bean
    public RedisSerializer<Object> springSessionDefaultRedisSerializer() {
        return new GenericJackson2JsonRedisSerializer();
    }

}
