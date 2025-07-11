package com.learning;

public class Alien {
    private int age;
    private Computer com;

    public Alien() {
        System.out.println("Alien object created");
    }

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
