package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = {"Bean_test"})
public class App
{
    public static void main( String[] args ){
        SpringApplication.run(WebMvcApp.class, args);
    }
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        ClassicMusic magic = context.getBean(ClassicMusic.class);

        MagicSpringClass magicSpringClass = new MagicSpringClass(magic);
        magicSpringClass.say();
    }
}
