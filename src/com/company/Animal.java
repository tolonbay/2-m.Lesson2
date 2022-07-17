package com.company;

public abstract class Animal implements Drawble {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
