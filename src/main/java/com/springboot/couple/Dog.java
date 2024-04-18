package com.springboot.couple;

import org.springframework.stereotype.Component;


public class Dog implements Animal{
    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
}
