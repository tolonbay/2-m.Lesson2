package com.company;

public abstract class Figure implements Drawble {
    public String name;

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract int getPerimeter();
}
