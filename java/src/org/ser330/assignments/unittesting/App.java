package org.ser330.assignments.unittesting;
public class App {
    public static void main(String[] args) throws Exception {

        BankAccount account = new BankAccount("1234456", 100);
        account.deposit(10);
        account.withdraw(110);
    }
}
