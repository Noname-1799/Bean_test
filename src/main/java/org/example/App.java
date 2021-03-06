package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages={"org.example"})
@EntityScan
public class App
{
    public static void main( String[] args ){
        SpringApplication.run(App.class, args);
    }
}
