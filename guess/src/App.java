// Project 17: Guess the Number Game
// Background: Games like number guessing improve logic and use of random numbers. This project will help you practice loops and conditionals.
// Task: Write a Java program that generates a random number and lets the user guess it.
// Requirements:
// •
// - Generate a random number between 1 and 100.
// •
// - Prompt the user to guess until correct.
// •
// - Give hints if the guess is too high or low.
// Example Run: Input: 50 (too high), 25 (too low), 30 (correct) Output: You guessed it!

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int ComputerGuess = random.nextInt(1, 11);



        System.out.println("Welcome to the NUMBER GUESSING GAME");
        System.out.print("Enter your guess: ");
        int response = scanner.nextInt();

        int tries = 0;

        while((response != ComputerGuess) && (tries < 5)){

            tries++;
            
            if (response < ComputerGuess) {
                System.out.print("Too low: ");
            }
            else if (response > ComputerGuess) {
                
                System.out.print("Too high: ");
            }
            response = scanner.nextInt();

        }

        if (tries < 5) {

            System.out.println("You've won!");
        }
        else {
            System.out.println("You've lost");
        }



        scanner.close();



    }
}
