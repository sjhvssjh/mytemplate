package com.sjh.canal;


import com.xpand.starter.canal.annotation.EnableCanalClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @program:
 * @description:
 * @author: Shen jihao
 * @create: 2021/6/9 16:08
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableCanalClient
public class CanalServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CanalServiceApplication.class, args);
    }
}
