package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    
        Cat cat1 = new Cat();
        cat1.name = "Grizabella";
        cat1.furColor = "white";
        cat1.age = 29;
        
        cat1.tellYourName();
        cat1.tellYourFurColor();
        cat1.tellYourAge();

        System.out.println("-------------");

        Cat cat2 = new Cat();
        cat2.name = "Alonzo";
        cat2.furColor = "grey";
        cat2.age = 35;
        
        cat2.tellYourName();
        cat2.tellYourFurColor();
        cat2.tellYourAge();
        
        


    }

}

