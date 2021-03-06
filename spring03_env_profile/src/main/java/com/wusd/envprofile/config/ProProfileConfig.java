package com.wusd.envprofile.config;

import com.wusd.envprofile.CompactDisc;
import com.wusd.envprofile.impl.EnvironmentDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("pro")
public class ProProfileConfig {
    @Bean
    public CompactDisc proCompactDisc() {
        return new EnvironmentDisc("pro");
    }
}
