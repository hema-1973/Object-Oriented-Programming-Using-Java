import java.util.Scanner;

interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount) throws Exception;
    void balanceEnquiry();
}

class Bank implements BankAccount {
    double balance = 1000;

    public void deposit(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Invalid amount");

        balance = balance + amount;
        System.out.println("Amount Deposited Successfully");
    }

    public void withdraw(double amount) throws Exception {
        if (amount <= 0)
            throw new IllegalArgumentException("Invalid amount");

        if (amount > balance)
            throw new Exception("Insufficient Balance");

        balance = balance - amount;
        System.out.println("Amount Withdrawn Successfully");
    }

    public void balanceEnquiry() {
        System.out.println("Current Balance = Rs." + balance);
    }
}

public class Balance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new Bank();

        int choice;
        double amount;

        do {
            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance Enquiry");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            try {
                switch (choice) {

                    case 1:
                        System.out.print("Enter deposit amount: ");
                        amount = sc.nextDouble();
                        account.deposit(amount);
                        break;

                    case 2:
                        System.out.print("Enter withdrawal amount: ");
                        amount = sc.nextDouble();
                        account.withdraw(amount);
                        break;

                    case 3:
                        account.balanceEnquiry();
                        break;

                    case 4:
                        System.out.println("Thank You!");
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }
            }
            catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 4);

        sc.close();
    }
}