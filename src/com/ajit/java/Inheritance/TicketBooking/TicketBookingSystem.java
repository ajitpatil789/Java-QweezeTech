package com.ajit.java.Inheritance.TicketBooking;

class Ticket {
    int ticketNumber;
    String passengerName;
    double price;

    public Ticket(int ticketNumber, String passengerName, double price) {
        this.ticketNumber = ticketNumber;
        this.passengerName = passengerName;
        this.price = price;
    }

    public void displayTicketDetails() {
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Ticket Price: ₹" + price);
    }
}

class BusTicket extends Ticket {
    int seatNumber;

    public BusTicket(int ticketNumber, String passengerName, double price, int seatNumber) {
        super(ticketNumber, passengerName, price);
        this.seatNumber = seatNumber;
    }

    public double calculateDiscount() {
        return price * 0.10; // 10% discount for bus tickets
    }

    @Override
    public void displayTicketDetails() {
        super.displayTicketDetails();
        System.out.println("Seat Number : " + seatNumber);
        System.out.println("Discount ₹:" + calculateDiscount());
        System.out.println("Final Ticket Price : " + (price - calculateDiscount()));
    }
}

class TrainTicket extends Ticket {
    String coachType;

    public TrainTicket(int ticketNumber, String passengerName, double price, String coachType) {
        super(ticketNumber, passengerName, price);
        this.coachType = coachType;
    }

    public double calculateReservationFee() {
        if (coachType.equalsIgnoreCase("AC")) {
            return 100;
        } else {
            return 50;
        }
    }

    @Override
    public void displayTicketDetails() {
        super.displayTicketDetails();
        System.out.println("Coach type: " + coachType);
        System.out.println("Reservation fee: ₹" + calculateReservationFee());
        System.out.println("Final Ticket Price : " + (price + calculateReservationFee()));
    }
}

class FlightTicket extends Ticket {
    String flightClass;  // Economy,Business

    public FlightTicket(int ticketNumber, String passengerName, double price, String flightClass) {
        super(ticketNumber, passengerName, price);
        this.flightClass = flightClass;
    }

    public double calculateExtraCharges() {
        return flightClass.equalsIgnoreCase("Business") ? 500 : 200;
    }

    @Override
    public void displayTicketDetails() {
        super.displayTicketDetails();
        System.out.println("Flight Class: " + flightClass);
        System.out.println("Extra charges: ₹" + calculateExtraCharges());
        System.out.println("Final Ticket Price : " + (price + calculateExtraCharges()));
    }
}

public class TicketBookingSystem {
    public static void main(String[] args) {
        BusTicket busTicket = new BusTicket(101, "Ajit Patil", 200, 1);
        TrainTicket trainTicket = new TrainTicket(102, "Vihaan", 300, "Sleeper");
        FlightTicket flightTicket = new FlightTicket(103, "Sneha Patil", 500, "Business");
        System.out.println("🚌 Bus Ticket Details:");
        busTicket.displayTicketDetails();

        System.out.println("\n🚆 Train Ticket Details:");
        trainTicket.displayTicketDetails();

        System.out.println("\n✈️ Flight Ticket Details:");
        flightTicket.displayTicketDetails();

    }
}
