// Project 10: Simple Interest Calculator
// Background:
// Banks often calculate interest based on simple formulas. This project will help you practice
// arithmetic and methods.
// Task:
// Write a Java program that calculates simple interest.
// Requirements:
// • - Prompt the user for principal, rate, and time.
// • - Create a method to calculate simple interest.
// • - Print the result.
// Example Run:
// Input: P=1000, R=5, T=2
// Output: 100

import java.util.Scanner;


public class App {
    static double interest (double principal, double rate, double time) {
        rate = rate / 100;
        double result = principal * rate * time;
        return result;
    }
    public static void main(String[] args) throws Exception {

        double principal, rate, time;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the principal: ");
        principal = scanner.nextDouble();

        System.out.print("What is the rate: ");
        rate = scanner.nextDouble();

        System.out.print("What is the rate: ");
        time = scanner.nextDouble();

        System.out.println(interest(principal, rate, time));




        scanner.close();
       
    }
}
