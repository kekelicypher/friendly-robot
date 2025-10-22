// Project 19: Basic Quiz App
// Background: Quizzes are commonly used in education. This project will help you practice arrays, conditionals, and loops.
// Task: Write a Java program that asks the user 5 questions and keeps score.
// Requirements:
// •
// - Store 5 questions and answers.
// •
// - Prompt the user for their answers.
// •
// - Keep track of correct answers.
// •
// - Print the final score.
// Example Run: Score: 3/5

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int score = 0;

        String question1 = "How many planets in the solar system? ";
        String answer1 = "8";
        String question2 = "All the planets revolve around the ...";
        String answer2 = "Sun";
        String question3 = "The biggest planet in our Solar System is ...";
        String answer3 = "Jupiter";

        String[] questions = {question1, question2, question3};
        String[] answers = {answer1, answer2, answer3};
        String[] userAnswer = new String[questions.length];


        //TODO  add the remaining  questions

        for (int i = 0; i < questions.length; i ++) {
            System.out.println(questions[i]);
            userAnswer[i] = scanner.nextLine();

            if (userAnswer[i].equals(answers[i])) {
                score++;
            }

        }

        System.out.println();

        System.out.println("Your final score is " + score + "/3");


        scanner.close();

    }
}
