package com.city.phonemall.cart.exception;


import com.city.common.utils.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author liuZhongKun
 * @Description: 统一异常处理
 * @email 1071607950@qq.com
 * @date 2021-05-30 08:47:33
 **/

@ControllerAdvice
public class RuntimeExceptionHandler {

    /**
     * 全局统一异常处理
     *
     * @param exception
     * @return
     */
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public R handler(RuntimeException exception) {
        return R.error(exception.getMessage());
    }


    @ExceptionHandler(CartExceptionHandler.class)
    public R userHandler(CartExceptionHandler exception) {
        return R.error("购物车无此商品");
    }
}
