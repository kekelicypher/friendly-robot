import java.util.Scanner;

// Project 9: Fibonacci Series Generator
// Background:
// The Fibonacci sequence is a famous series in mathematics. This project will help you
// practice loops and methods.
// Task:
// Write a Java program that generates the Fibonacci series up to N terms.
// Requirements:
// • - Prompt the user for N.
// • - Create a method fibonacci(int n) that generates the sequence.
// • - Print the sequence.
// Example Run:
// Input: 5
// Output: 0 1 1 2 3

public class App {

    static void fib(int num) {
        int first = 0;
        int second = 1;

        System.out.println(first);

        for(int i = 0; i < num; i ++) {

            int result = first + second;

            System.out.println(result);

            first = second;
            second = result;

            
        }



    }

    public static void main(String[] args) {

        System.out.print("Enter a number: ");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        fib(input);


        scanner.close();





    }
    
}
