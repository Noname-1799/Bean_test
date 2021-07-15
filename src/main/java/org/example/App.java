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
        //ClassicMusic magic = context.getBean(ClassicMusic.class);

        MagicSpringClass magicSpringClass = new MagicSpringClass(magic);
        magicSpringClass.say();
    }
}
