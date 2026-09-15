package Project2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ATMMain {

    public static void main(String[] args) {

        Scanner sc2 = new Scanner(System.in);

        System.out.println("Select Account Type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");

        Customer customer = new Customer(101, "Praveen", "9876543210");
        Account account;

        // Account type validation
        try {
            int accountType = sc2.nextInt();

            if (accountType == 1) {
                account = new SavingsAccount(123456789, 9090, 10000,customer);
            }
            else if (accountType == 2) {
                account = new CurrentAccount(123456789, 9090, 10000,customer);
            }
            else {
                System.out.println("Invalid Account type!");
                return;
            }

        }
        catch (InputMismatchException e) {
            System.out.println("Please enter 1 or 2!");
            sc2.nextLine();
            return;
        }

        ATM a = new ATM(account, sc2);

        // Account number validation
        try {
            System.out.println("Enter Account Number:");
            long enteredAccountNumber = sc2.nextLong();

            System.out.println("Enter PIN:");
            int enteredPin = sc2.nextInt();

            if (enteredAccountNumber == account.getAccountNumber()
                    && enteredPin == account.getPin()) {
            	 Customer loggedInCustomer = account.getCustomer();

            	    System.out.println("Customer ID: " + loggedInCustomer.getCustomerId());
            	    System.out.println("Customer Name: " + loggedInCustomer.getName());
            	    System.out.println("Phone Number: " + loggedInCustomer.getPhoneNumber());

                int choice;

                do {
                    System.out.println("\n1. Check Balance");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Deposit");
                    System.out.println("4. Change Pin");
                    System.out.println("5. Exit");

                    try {
                        choice = sc2.nextInt();

                        switch (choice) {

                        case 1:
                            a.checkBalance();
                            break;

                        case 2:
                            a.withdraw();
                            break;

                        case 3:
                            a.deposit();
                            break;

                        case 4:
                            a.changePin();
                            break;

                        case 5:
                            System.out.println("Exited");
                            break;

                        default:
                            System.out.println("Invalid choice!");
                        }

                    }
                    catch (InputMismatchException e) {
                        System.out.println("Please enter a number from 1 to 5!");
                        sc2.nextLine();
                        choice = 0;
                    }

                } while (choice != 5);

            }
            else {
                System.out.println("Invalid Account Number or PIN!");
            }

        }
        catch (InputMismatchException e) {
            System.out.println("Please enter a valid Account Number and PIN!");
            sc2.nextLine();
        }

        sc2.close();
    }
}
