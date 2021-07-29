package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/**
 * Hello world!
 *
 */
@SpringBootApplication
//@ComponentScan(value = {"Bean_test"})
public class App
{
    public static void main( String[] args ){
        SpringApplication.run(App.class, args);
    }
}
