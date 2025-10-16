// Project 18: Rock, Paper, Scissors
// Background: Rock, paper, scissors is a simple game played worldwide. This project will help you practice random numbers and conditionals.
// Task: Write a Java program that lets the user play rock-paper-scissors against the computer.
// Requirements:
// •
// - Prompt the user for their choice.
// •
// - Randomly generate the computer's choice.
// •
// - Decide who wins.
// •
// - Print the result.
// Example Run: Input: Rock, Computer: Scissors Output: You win!

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to ROCK PAPER SCISSORS GAME!!");

        System.out.print("Press, 'r' for ROCK, 'p' for PAPER, and 's' for SCISSORS: ");

        Scanner scanner = new Scanner(System.in);

        String choice = scanner.next();

        Random random = new Random();

        int computer = random.nextInt(1, 4);

        String computerChoice = "";
        boolean win = false;

        if(computer == 1) {
            computerChoice = "r";
        }
        else if(computer == 2) {
            computerChoice = "p";
        }
        else {
            computerChoice = "s";
        }

        // COMPUTER WINNING

        // if ((computerChoice.equals("r") && choice.equals("s")  )) {
        //     System.out.println("You lose!!");
        // }
        // else if (computerChoice.equals("p") && choice.equals("r")) {
        //     System.out.println("You lose!!");

        



        scanner.close();

    }
}
