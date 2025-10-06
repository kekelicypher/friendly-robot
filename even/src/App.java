

import java.util.Scanner;

/*
 * Project 3: Odd or Even Checker
Background:
Odd and even numbers form the foundation for many number theory problems. This
program will help you practice conditionals and methods.
Task:
Write a Java program that determines if a number is odd or even.
Requirements:
• - Prompt the user for a number.
• - Create a method isEven(int n) that returns true or false.
• - Print whether the number is odd or even.
Example Run:
Input: 4
Output: Even

 */


public class App {

    static boolean isEven(int number) {
        if (number % 2 == 0) {
            // System.out.println("The number is even");
            return true;
        }
        else { 
            // System.out.println("The number is odd");
            return false;
        }
    }

    public static void main (String[] args) {

        System.out.print("Enter a number to check: ");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (isEven(input)) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
            
        };



        scanner.close();





    }
    
}
