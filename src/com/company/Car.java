package com.company;

public class Car implements AnimalTransport{
    @Override
    public void say() {
        System.out.println("brrrrr");
    }

    @Override
    public void canSwim() {
        System.out.println("No");
    }

    @Override
    public void canRun() {
        System.out.println("Yeas");
    }

    @Override
    public void canFly() {
        System.out.println("No");
    }
}
