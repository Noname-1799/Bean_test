package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

        MagicSpringClass magigSpringClass = new MagicSpringClass();
        magigSpringClass.say();
    }

    public ClassicMusic getBean(ClassicMusic classicMusic){
        return classicMusic;
    }
}
