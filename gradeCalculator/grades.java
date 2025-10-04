// Project 6: Grade Calculator
// Background:
// Teachers often calculate grades based on averages. This project will help you practice
// arrays, loops, and conditionals.
// Task:
// Write a Java program that calculates a student's grade from their marks.
// Requirements:
// • - Prompt the user to enter marks for 5 subjects.
// • - Calculate the average.
// • - Use conditionals to assign a grade (A, B, C, D, F).
// • - Display the grade.
// Example Run:
// Input: [80, 75, 90, 60, 85]
// Output: Grade B

package gradeCalculator;

import java.util.Scanner;

public class grades {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 marks");

        double mark, total = 0, average = 0;

        for(int i = 0; i < 5; i++) {
            System.out.printf("Enter mark for grade #%d: ", i);
            mark = scanner.nextInt();

            total += mark;            
        }

        average = total/5.0;

        if (average <= 100 && average >= 85) {
            System.out.println("Grade: A");
        }
        else if (average <= 84 && average >= 75) {
            System.out.println("Grade: B");
        }
        else if (average <= 74 && average >= 65) {
            System.out.println("Grade: C");
        }
        else if (average <= 64 && average >= 55) {
            System.out.println("Grade: D");
        }
        else if (average < 55) {
            System.out.println("Grade: F");
        }


        scanner.close();    }

    
}