package org.example;

public class MagicSpringClass {

    public ClassicMusic magic;

    public MagicSpringClass(ClassicMusic magicBeanInjection){
        this.magic = magicBeanInjection;
    }

    public void say(){
        System.out.println(magic.getSong());
    }
}
