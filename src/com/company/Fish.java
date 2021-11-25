package com.company;

public class Fish implements AnimalTransport{
    @Override
    public void say() {
        System.out.println(" - ");
    }

    @Override
    public void canSwim() {
        System.out.println("Yes");
    }

    @Override
    public void canRun() {
        System.out.println("no");
    }

    @Override
    public void canFly() {
        System.out.println("no");
    }
}
