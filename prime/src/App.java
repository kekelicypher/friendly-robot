

import java.util.Scanner;

// Project 5: Prime Number Checker
// Background:
// Prime numbers are important in computer science, especially in cryptography. This project
// will help you practice loops and conditionals.
// Task:
// Write a Java program that checks if a number is prime.
// Requirements:
// • - Prompt the user for a number.
// • - Create a method isPrime(int n) that returns true or false.
// • - Print whether the number is prime.
// Example Run:
// Input: 7
// Output: Prime


class App {

    static boolean isPrime(int n) {
        int counter = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter ++;
            }

        }
        if (counter == 2) {
            return true;

        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();

        if (isPrime(input)){
            System.out.println("Prime");            
        }

        else {
            System.out.println("Not prime");
        }

        
        scanner.close();

    }

}