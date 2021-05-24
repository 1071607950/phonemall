package com.city.phonemall.auth.config;

import org.springframework.context.annotation.Configuration;

/**
 * @author liuZhongKun
 * @Description: 自定义阻塞返回方法
 * @email 1071607950@qq.com
 * @date 2021-05-24 09:47:33
 **/

@Configuration
public class PhonemallAuthServerSentinelConfig {
    //TODO 还没实现
    /*public PhonemallAuthServerSentinelConfig() {

        WebCallbackManager.setUrlBlockHandler(new UrlBlockHandler() {
            @Override
            public void blocked(HttpServletRequest request, HttpServletResponse response, BlockException ex) throws IOException {
                R error = R.error(BizCodeEnum.TO_MANY_REQUEST.getCode(), BizCodeEnum.TO_MANY_REQUEST.getMessage());
                response.setCharacterEncoding("UTF-8");
                response.setContentType("application/json");
                response.getWriter().write(JSON.toJSONString(error));

            }
        });

    }*/

}
