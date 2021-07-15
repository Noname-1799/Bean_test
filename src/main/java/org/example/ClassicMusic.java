package org.example;

public class ClassicMusic implements Music{
    public ClassicMusic() {}

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Classic";
    }
}
