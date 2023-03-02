class BankAccount:          

    def __init__(self, accountNumber = '1234567', initialBalance = 0) -> None:
        self.accountNumber = accountNumber
        self.balance = initialBalance

    def withdraw(self, amount):
            # Update account balance to equal balance = balance + (-amount)
            self.balance += -amount

    def deposit(self, amount):
        self.balance += amount
