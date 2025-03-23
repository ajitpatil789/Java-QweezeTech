package com.ajit.java.Polymorphism.Payment;

class Payment {
    void pay() {
        System.out.println("Payment Processing........");
    }
}

class DebitCard extends Payment {
    @Override
    void pay() {
        super.pay();
        System.out.println("Payment through debit card");
    }
}

class Paytm extends Payment {
    @Override
    void pay() {
        super.pay();
        System.out.println("Payment through Paytm");
    }
}

public class PaymentMain {
    public static void main(String[] args) {
        Payment debitCard = new DebitCard();
        Payment paytm = new Paytm();
        System.out.println("Processing DebitCard payment:");
        debitCard.pay();
        System.out.println("\nProcessing Paytm payment:");
        paytm.pay();
    }


}
