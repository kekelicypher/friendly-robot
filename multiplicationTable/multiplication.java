package multiplicationTable;

import java.util.Scanner;

// Project 7: Multiplication Table Generator
// Background:
// Multiplication tables are often taught in schools. This project will help you practice loops
// and methods.
// Task:
// Write a Java program that generates a multiplication table for a given number.
// Requirements:
// • - Prompt the user for a number.
// • - Print the multiplication table up to 12.
// • - Use a method to generate the table.
// Example Run:
// Input: 5
// Output: 5x1=5 ... 5x12=60

class multiplication {

    static void table(int number) {


        for(int i = 1; i <= 12; i++) {

            int result = number * i;


            System.out.printf("%d X %d = %d\n", number, i, result);

        }


    }

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int number = scanner.nextInt();

        table(number);

        scanner.close();


    }
}