package com.city.phonemall.cart;

import com.city.phonemall.cart.service.CartService;
import com.city.phonemall.cart.vo.CartItemVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ExecutionException;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
class PhonemallCartApplicationTests {

    @Autowired
    private CartService cartService;

    @Test
    public void contextLoads() throws ExecutionException, InterruptedException {

        CartItemVo cartItemVo = cartService.addToCart(1L, 2);

        log.info("cartItemVo:{}", cartItemVo);

    }

}
