abstract class BankAccount {
    private String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            double currentBalance = getBalance();
            currentBalance += amount;
            setBalance(currentBalance);
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        double currentBalance = getBalance();
        if (amount > 0 && amount <= currentBalance) {
            currentBalance -= amount;
            setBalance(currentBalance);
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double overdraftLimit) {
        super(accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            double currentBalance = getBalance();
            currentBalance += amount;
            setBalance(currentBalance);
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        double currentBalance = getBalance();
        if (amount > 0 && amount <= currentBalance + overdraftLimit) {
            currentBalance -= amount;
            setBalance(currentBalance);
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }
}

public class Account {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA12345", 0.05);
        CurrentAccount currentAccount = new CurrentAccount("CA67890", 1000.0);

        savingsAccount.deposit(1000.0);
        savingsAccount.withdraw(500.0);

        currentAccount.deposit(2000.0);
        currentAccount.withdraw(2500.0);
    }
}
