package com.auto.parts.available;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PreDestroy;

@Slf4j
@SpringBootApplication
public class WareHouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(WareHouseApplication.class, args);
        log.info("*********************************************");
        log.info("******* WareHouseApplication started ********");
        log.info("*********************************************");
    }

    @PreDestroy
    public void destroy(){
        log.info("*********************************************");
        log.info("******* WareHouseApplication stoped *********");
        log.info("*********************************************");
    }
}
