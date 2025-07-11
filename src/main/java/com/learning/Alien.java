package com.learning;

public class Alien {
    private int age;
    private Computer com;

    public Alien() {
        System.out.println("Alien object is created");
    }

//    public Alien(int age, Laptop lap) {
//        System.out.println("Parameterized constructor called");
//        this.age = age;
//        this.lap = lap;
//    }

    public void setAge(int age) {
        System.out.println("Setter for age called");
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        System.out.println("coding...");
        com.compile(); // uses injected Laptop object
    }
}
