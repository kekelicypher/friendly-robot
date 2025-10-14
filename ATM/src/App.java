// Project 16: Simple ATM System
// Background: ATM machines let users check balance, withdraw, and deposit. This project will help you practice conditionals and methods.
// Task: Write a Java program that simulates a simple ATM.
// Requirements:
// •
// - Start with a balance of 1000.
// •
// - Allow user to check balance, withdraw, deposit.
// •
// - Prevent overdrawing the account.
// •
// - Use methods for each operation.
// Example Run: Input: Withdraw 200 Output: Balance=800
import java.util.Scanner;
public class App {
    static double balance = 1000;
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 'a' to check balance, 'b' to deposit, and 'c' to withdraw: ");
        String option = scanner.next();

       if (option.equals("a")) {
        System.out.println(balance);
       }
       else if (option.equals("b")) {
        System.out.print("Enter amount to deposit: ");
        double amountToDeposit = scanner.nextDouble();
        deposit(amountToDeposit);

       }
       else if (option.equals("c")) {
        System.out.print("Enter amount to withdraw: ");
        double amountToWithdraw = scanner.nextDouble();
        withdraw(amountToWithdraw);
       }

        scanner.close();

    }

    static void withdraw(double money){

        if (money < balance) {
            balance -= money; 
            System.out.println(money+ " withdrawn successfully");
            System.out.println("Balance = " + balance);
        }
        else{
            System.out.println("Not enough fund");
        }
    }
    static void deposit(double money) {
        if(money > 0) {
            System.out.println("Money deposited succesfully!");
            balance += money;
        }
        else{
            System.out.println("Invalid amount. Couldn't deposit");
        }
    }
}
