package com.city.phonemall.auth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author liuZhongKun
 * @Description:
 * @email 1071607950@qq.com
 * @date 2021-05-24 09:47:33
 **/
@Configuration
public class PhonemallWebConfig implements WebMvcConfigurer {

    /**
     * ·
     * 视图映射:发送一个请求，直接跳转到一个页面
     *
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        // registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/reg.html").setViewName("reg");
    }
}
