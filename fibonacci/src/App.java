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

    static void fibonacci(int num) {
        int first = 0;
        int second = 1;

        
        for(int i = 0; i < num; i ++) {
            
            if(i == 0) {
                System.out.print(first);
            }
            else if( i == 1) {
                System.out.print(" " + second);
            }

            else {
                int next = first + second;

                System.out.print(" " + next);

                first = second;
                second = next;
}
            
        }



    }

    public static void main(String[] args) {

        System.out.print("Enter a number: ");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        fibonacci(input);


        scanner.close();





    }
    
}
