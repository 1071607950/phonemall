package com.city.phonemall.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PhonemallThirdPartyApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhonemallThirdPartyApplication.class, args);
    }

}
