package com.ajit.java.Constructor;

public class ChainMethod {
    private String name;
    private int age;

    public ChainMethod setName(String name) {
        this.name = name;
        return this;
    }

    public ChainMethod setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "ChainMethod{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
