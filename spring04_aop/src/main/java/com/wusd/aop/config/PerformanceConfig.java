package com.wusd.aop.config;

import com.wusd.aop.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class PerformanceConfig {
    @Bean
    public Audience audience() {
        return new Audience();
    }
    @Bean
    public Performance movie() {
        return new Movie();
    }

    @Bean
    public Performance music() {
        return new Music();
    }
    @Bean
    public Performance talkShow() {
        return new TalkShow();
    }

}
