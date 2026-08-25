package core_java;

class Account {
    int no;
    double bal;
    String type;

    Account(int no, double bal, String type) {
        this.no = no;this.bal = bal;
        this.type = type;
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    void withdraw(double amt) {
        if (amt <= bal) {
            bal -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void calculateInterest() {
        double interest = balance * 0.04;
        System.out.println("Interest: " + interest);
    }

    void display() {
        System.out.println("No : " + no);
        System.out.println(" Type   : " + type);
        System.out.println("Balance        : " + bal);
    }
}

public class AccountDemo {
    public static void main(String[] args) {

        Account acc = new Account(1001, 10000, "Savings");

        a.display();

        a.deposit(2000);

        a.withdraw(3000);

        a.calculateInterest();

        a.display();
    }
}
