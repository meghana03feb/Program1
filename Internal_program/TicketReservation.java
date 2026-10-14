class Reservation {
    private int availableSeats;

    // Constructor to initialize available seats
    Reservation(int seats) {
        availableSeats = seats;
    }

    // Synchronized method to reserve tickets
    synchronized void reserveTicket(String customer, int seats) {
        if (availableSeats >= seats) {
            System.out.println(customer + " reserved "
                    + seats + " seat(s) successfully.");

            availableSeats = availableSeats - seats;

            System.out.println("Available seats: " + availableSeats);
        } else {
            System.out.println(customer
                    + " failed to reserve tickets. Not enough seats.");
        }
    }
}

class Customer extends Thread {
    private Reservation reservation;
    private int seats;

    // Constructor to initialize customer details
    Customer(Reservation reservation, String name, int seats) {
        super(name);
        this.reservation = reservation;
        this.seats = seats;
    }

    // Thread execution method
    public void run() {
        reservation.reserveTicket(getName(), seats);
    }
}

public class TicketReservation {
    public static void main(String[] args) {
        // Create a reservation system with 5 seats
        Reservation reservation = new Reservation(5);

        // Create multiple customer threads
        Customer c1 = new Customer(reservation, "Customer 1", 2);
        Customer c2 = new Customer(reservation, "Customer 2", 3);
        Customer c3 = new Customer(reservation, "Customer 3", 2);

        // Start all customer threads
        c1.start();
        c2.start();
        c3.start();
    }
}
