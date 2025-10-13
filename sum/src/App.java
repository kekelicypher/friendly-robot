// Project 13: Sum of Array Elements
// Background: Summing elements in an array is a common programming task. This project will help you practice arrays and loops.
// Task: Write a Java program that calculates the sum of array elements.
// Requirements:
// •
// - Prompt the user to enter array elements.
// •
// - Create a method sumArray that returns the sum.
// •
// - Print the result.
// Example Run: Input: [2,4,6] Output: 12

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter # of elements: ");

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        double[] array = new double[num];

        
        for(int i = 0; i < num; i++){
            System.out.print("Enter #" + (i+1) + ": ");
            array[i] = scanner.nextDouble();
        }

        System.out.println("Sum: " + sumArray(array));


        scanner.close();
        




    }
    static double sumArray (double[] array) {
        double sum = 0;

        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;

    }
}
