package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MainConfig {

    @Bean
    @Scope("singleton")
    public ClassicMusic classicMusic(){
        return new ClassicMusic();
    }
}
