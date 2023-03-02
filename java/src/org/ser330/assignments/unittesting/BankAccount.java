package org.ser330.assignments.unittesting;

public class BankAccount {

    private String _accountNumber;
    private int _balance = 0;

    /**
     * @param accountNumber
     */
    public BankAccount(String accountNumber)
    {
        _accountNumber = accountNumber;
    }

    /**
     * @param accountNumber
     * @param initialBalance
     */
    public BankAccount(String accountNumber, int initialBalance)
    {
        _accountNumber = accountNumber;
        _balance = initialBalance;
    }

    /**
     * @param amount
     */
    public void withdraw(int amount)
    {
        _balance += -amount;
    }

    /**
     * @param amount
     */
    public void deposit(int amount)
    {
        _balance += amount;
    }

    public int getBalance()
    {
        return _balance;
    }
}
