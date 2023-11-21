package com.helpers.base.ani;

import com.helpers.base.Animal;

public class Horse implements Animal {
    private int ears;
    int legs;
    String name;

    @Override
    public void swim() {
        System.out.println("I can run");
    }
    public void swim(int a, int b) {
        System.out.println("I can run");
    }

    public int getEars() {
        return ears;
    }

    public void setEars(int ears) {
        this.ears = ears;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
