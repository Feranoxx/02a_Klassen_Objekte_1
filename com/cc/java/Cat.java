package com.cc.java;

public class Cat {
    
    public String name;
    public String furColor;
    public int age;

    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    
    public String getFurColor() {
        return this.furColor;
    }

    public int getAge() {
        return this.age;
    }

}
