package com.city.phonemall.ware;

import io.seata.spring.boot.autoconfigure.SeataAutoConfiguration;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableRabbit
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication(exclude = SeataAutoConfiguration.class)
public class PhonemallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhonemallWareApplication.class, args);
    }

}
