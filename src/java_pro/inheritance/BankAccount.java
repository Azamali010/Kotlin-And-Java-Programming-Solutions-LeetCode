package java_pro.inheritance;

public class BankAccount {
    public double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient funds to withdraw $" + amount + ". Minimum balance of $100 must be maintained.");
        }
    }

    public double calculateInterest() {
        return balance * interestRate;
    }
}

class Main{
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);

        savingsAccount.deposit(500);
        System.out.println("Balance after deposit: $" + savingsAccount.getBalance());

        savingsAccount.withdraw(200);
        System.out.println("Balance after withdrawal: $" + savingsAccount.getBalance());

        System.out.println("Interest earned: $" + savingsAccount.calculateInterest());
    }
}
