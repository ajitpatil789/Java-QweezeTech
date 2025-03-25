package com.ajit.java.Interface;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();  //dynamic dispatchment
        Animal cat = new Cat();
        dog.sleep();
        dog.eat();
        System.out.println(Animal.NAME);
        dog.display();
        cat.eat();
        cat.sleep();
        System.out.println("Multiple Interface");
        System.out.println();
        CrowAndCow obj = new CrowAndCow();
        obj.eat();
        obj.sleep();
        obj.fly();
        obj.makeSound();
        obj.display();


    }
}
