from account_def import BankAccount    # The code to test
import unittest   # The test framework

class Test_TestBankAccount(unittest.TestCase):
    def test_withdraw(self):
        # Arrange
        account = BankAccount('Test')
        amount = 10

        # Act
        account.withdraw(amount)

        # Assert
        assert account.balance == -amount

if __name__ == '__main__':
    unittest.main() 