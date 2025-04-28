package com.ajit.test.oopsPractice.HospitalSystem;

public class Patient extends Person {
    String disease;

    public Patient(String name, String disease) {
        super(name);
        this.disease = disease;
    }
}
