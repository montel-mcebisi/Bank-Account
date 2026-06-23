import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BankAccount transaction = new BankAccount();
        boolean transact = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Types of transactions we have: \ndeposit \nwithdraw \nbalance \nclose ");
        String operation;

        while (true) {
            System.out.print("Which transaction do you want to do?: ");
            operation = input.nextLine();

            switch (operation) {
                case "deposit":
                System.out.print("Enter amount you want to deposit: ");
                transaction.deposit(input.nextDouble());
                input.nextLine();
                break;

            case "withdraw":
                System.out.print("Enter amount you want to withdraw: ");
                transaction.withdraw(input.nextDouble());
                input.nextLine();
                break;

            case "balance":
                System.out.println("Your balance is: " + transaction.checkBalance());
                break;

            case "close":
                transaction.closeBank();
                return;

            default:
                System.out.println("Enter a valid transaction keyword!");
            }
        }
    }
}
