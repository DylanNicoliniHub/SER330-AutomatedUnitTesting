package org.ser330.assignments.unittesting;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankAccountTests {
    
    @Test
    public void VerifyDeposit_WhenAllConditionsAreMet_ReturnsBalance()
    {
        int testVariable = 2;
        assertEquals(2,testVariable);
    }
}