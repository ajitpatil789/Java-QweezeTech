package com.ajit.test.oopsPractice.HospitalSystem;

public class Doctor extends Person {
    String specialization;

    public Doctor(String name, String specialization) {
        super(name);
        this.specialization = specialization;
    }

    void treatment(Patient p) {
        System.out.println(name + " is Treating " + p.name + " for " + p.disease);
    }
}
