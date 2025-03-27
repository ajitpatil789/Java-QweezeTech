package com.ajit.java.Interface.VehicleInterface;

public interface Vehicle {
    void start();

    default void stop() {       // Default method with implementation
        System.out.println("Vehicle is stopping...");
    }

    static void service() {     // Static method in the interface
        System.out.println("Vehicle service check completed!");
    }

}
