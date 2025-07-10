package com.learning;

public class Alien {
    private int age;
    private Laptop lap;

    public Alien() {
        System.out.println("Alien object is created");
    }

    public void setAge(int age) {
        System.out.println("Setter for age called");
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setLap(Laptop lap) {
        System.out.println("Setter for laptop called");
        this.lap = lap;
    }

    public void code() {
        System.out.println("coding...");
        lap.compile(); // uses injected Laptop object
    }
}
