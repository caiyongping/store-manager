package com.oyo.store;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author oyo
 * 项目启动类
 */
@SpringBootApplication
//@EnableAutoConfiguration(exclude ={DataSourceAutoConfiguration.class})
public class Application {
   //private static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
      //  System.out.print("hello");
       // logger.info("start program");
    }

}
