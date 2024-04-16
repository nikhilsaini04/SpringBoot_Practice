package com.springboot.couple;

public class Dog implements Animal{
    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
}
