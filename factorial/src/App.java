// Project 4: Factorial Calculator
// Background:
// Factorials are used in mathematics, statistics, and programming challenges. This project will
// help you practice loops and methods.
// Task:
// Write a Java program that computes the factorial of a number.
// Requirements:
// • - Prompt the user for a number.
// • - Use a method factorial(int n) to calculate the result.
// • - Display the factorial value.
// Example Run:
// Input: 5
// Output: 120

import java.util.Scanner;


public class App {

    public static int fact(int n) {
        int factorial = 1;
        for(int i = 1; i <= n; i++){
           factorial *= i;
        };
        return factorial;
    }

    public static void main(String[] args) {

        System.out.print("Enter a number: ");

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();



        System.out.println(fact(input));

        scanner.close();
    }
    
}
