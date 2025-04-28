package com.ajit.test.oopsPractice.HospitalSystem;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Roman", "Cough");
        Doctor doctor = new Doctor("Dr Sam", "all");
        doctor.treatment(patient);
    }
}
