package com.city.phonemall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PhonemallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhonemallCouponApplication.class, args);
    }

}
