package com.liuhao.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author: liuhao
 * @Date: 2021/6/4 10:12
 * @Description
 */
@SpringBootApplication
public class BlogApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class,args);
    }

    /**
     * 重写servlet初始化器
     * @param builder
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BlogApplication.class);
    }
}
