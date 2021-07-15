package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class MagicSpringClass {

    public ClassicMusic magic;

    public MagicSpringClass() { }

    public void say(){
        System.out.println(magic.getSong());
    }
}
