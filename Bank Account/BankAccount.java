
public class BankAccount {

    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }
    public void setBalance(double amount) {
        this.balance = amount;
    }
    public void deposit(double amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("Invalid amount!");
        } else {
            balance += amount;
        }
    }
    public void withdraw(double amount) {
        if((balance - amount) < 0.0) {
            throw new IllegalArgumentException("Insufficient funds!");
        } else {
            balance -= amount;
        }
    }
    public double checkBalance() {
        return balance;
    }
    public boolean closeBank() {
        return false;
    }
}