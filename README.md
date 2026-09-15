# ATM Operations POC

A Java-based ATM Operations Proof of Concept developed using Core Java and Object-Oriented Programming concepts.

## 📌 Project Overview

This project simulates basic ATM operations through a console-based application.

The application supports different account types and provides operations such as:

- Account authentication
- Balance checking
- Deposit
- Withdrawal
- PIN change
- Customer information display
- Input validation and exception handling

## 🛠️ Technologies Used

- Java
- Core Java
- Object-Oriented Programming (OOP)
- Interfaces
- Inheritance
- Polymorphism
- Method Overriding
- Encapsulation
- Exception Handling
- Scanner
- Input Validation

## 🏗️ Project Structure

```text
Customer
    ↓
Account
    ↑
 ┌──┴──────────┐
 ↓             ↓
Savings     Current

ATMOperations
      ↑
      |
     ATM
```
## 📂 Classes

### Customer

Stores customer information:

- **Customer ID**
- **Name**
- **Phone Number**

Uses encapsulation through private fields and getters/setters.

### Account

Acts as the parent class for different account types.

Contains common:

- **Account Number**
- **PIN**
- **Balance**
- **Deposit Operation**
- **Withdrawal Operation**

The `Account` class also maintains a relationship with the `Customer` class.

### SavingsAccount

Extends `Account` and overrides the withdrawal behavior.

A minimum balance of **₹1000** must be maintained.

### CurrentAccount

Extends `Account` and overrides withdrawal behavior.

Unlike the Savings Account, it does not enforce the **₹1000 minimum balance** restriction.

### ATMOperations

An interface defining the main ATM operations:

- **Check Balance**
- **Withdraw**
- **Deposit**
- **Change PIN**

### ATM

Implements `ATMOperations` and handles ATM operations and user input.

### ATMMain

Acts as the entry point of the application and manages:

- **Account type selection**
- **Authentication**
- **Customer information display**
- **ATM menu**
- **User input handling**

---

## ⚙️ Features

### 1. Account Selection

The user can select:

    1. Savings Account
    2. Current Account

### 2. Authentication

The application validates:

- **Account Number**
- **PIN**

### 3. Customer Information

After successful authentication, the application displays:

- **Customer ID**
- **Customer Name**
- **Phone Number**

### 4. Balance Check

Displays the current account balance.

### 5. Deposit

Allows the user to deposit money after validating the amount.

### 6. Withdrawal

Withdrawal rules differ based on account type.

#### Savings Account

- Amount must be positive
- Sufficient balance is required
- Minimum **₹1000** balance must be maintained

#### Current Account

- Amount must be positive
- Sufficient balance is required
- No **₹1000 minimum balance** restriction

### 7. PIN Change

The application validates:

- **Current PIN**
- **New PIN must contain exactly 4 digits**
- **New PIN confirmation**

### 8. Exception Handling

`InputMismatchException` is handled for invalid numeric input such as:

    abc

This prevents the application from terminating unexpectedly due to invalid input.

---

## 🧠 OOP Concepts Demonstrated

### Encapsulation

Private fields are used inside classes with controlled access through getters and setters.

Example:

    private double balance;

The balance is modified through controlled methods rather than direct field access.

### Inheritance

    Account
       / \
      /   \
    Savings  Current

`SavingsAccount` and `CurrentAccount` inherit common functionality from `Account`.

### Abstraction

The `ATMOperations` interface defines the operations that an ATM should provide.

### Method Overriding

Both `SavingsAccount` and `CurrentAccount` override the `withdraw()` method to implement different withdrawal rules.

### Polymorphism

An `Account` reference can refer to different child objects:

    Account account = new SavingsAccount(...);

or:

    Account account = new CurrentAccount(...);

The appropriate overridden `withdraw()` method is executed at runtime.

### HAS-A Relationship

The `Account` class contains a reference to the `Customer` class:

    private Customer customer;

This represents an **Account HAS-A Customer** relationship.

---

## ▶️ How to Run

1. Clone the repository.
2. Open the project in an IDE such as **Eclipse** or **IntelliJ IDEA**.
3. Run:

    ATMMain.java

4. Select the account type.
5. Enter the account number and PIN.
6. Perform ATM operations using the menu.

---

## 🔑 Sample Credentials

    Account Number: 123456789
    PIN: 9090

Sample customer:

    Customer ID: 101
    Name: Praveen
    Phone Number: 9876543210

---

## 📋 Sample Flow

    Select Account Type:
    1. Savings Account
    2. Current Account

    Enter Account Number:
    123456789

    Enter PIN:
    9090

    Customer ID: 101
    Customer Name: Praveen
    Phone Number: 9876543210

    1. Check Balance
    2. Withdraw
    3. Deposit
    4. Change Pin
    5. Exit

---

## 🎯 Learning Objectives

This project was developed to strengthen practical understanding of:

- **Core Java**
- **Object-Oriented Programming**
- **Encapsulation**
- **Inheritance**
- **Interfaces**
- **Abstraction**
- **Polymorphism**
- **Method Overriding**
- **Exception Handling**
- **Input Validation**
- **Console-based Application Development**

---

## 🚀 Future Enhancements

The following enhancements can be added in future versions:

- **Multiple Customer Accounts** — Support multiple customers and accounts instead of using fixed sample data.
- **Account Creation** — Allow users to create new Savings or Current accounts.
- **Transaction History** — Maintain and display previous deposits and withdrawals.
- **Database Integration** — Store customer, account, and transaction data using a database such as MySQL.
- **GUI Application** — Replace the console interface with a Java Swing or JavaFX-based GUI.
- **Authentication Improvements** — Add stronger authentication and account security mechanisms.
- **ATM Cash Management** — Simulate ATM cash availability and denomination handling.
- **Receipt Generation** — Generate a transaction receipt after deposits and withdrawals.
- **Admin Module** — Add administrative features for managing customers and accounts.
- **Spring Boot Integration** — Convert the POC into a REST-based backend application in a future version.

---

## 👨‍💻 Author

**Praveen Kona**
