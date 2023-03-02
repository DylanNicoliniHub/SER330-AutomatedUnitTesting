package org.ser330.assignments.unittesting;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankAccountTests {
    
    @Test
    public void VerifyWithdrawal_WhenAllConditionsAreMet_ReturnsBalance()
    {
        // Arrange
        BankAccount account = new BankAccount("1234567", 10);
        int withdrawalAmount = 10;

        // Act
        account.withdraw(withdrawalAmount);
        
        // Assert
        assertEquals(account.getBalance(), 0);
    }

    @Test
    public void VerifyWithdrawal_WhenWithdrawalIsNegative_ReturnsBalance()
    {
        // Arrange
        BankAccount account = new BankAccount("1234567", 10);
        int withdrawalAmount = -10;

        // Act
        account.withdraw(withdrawalAmount);
        
        // Assert
        assertEquals(0, account.getBalance());
    }
}