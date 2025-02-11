package design_patterns.facade.impl;

import design_patterns.facade.Key;

public class KeyBMW implements Key {

    @Override
    public void insert(){
        System.out.println("Key inserted");
    }

    @Override
    public void turn(){
        System.out.println("Key turned");
    }

    @Override
    public void remove() {
        System.out.println("Key removed");
    }
}

