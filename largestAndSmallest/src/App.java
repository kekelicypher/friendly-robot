// Project 11: Largest and Smallest in Array 
// Background: 
// Finding maximum and minimum values is common in programming. This project will help 
// you practice arrays and loops. 
// Task: 
// Write a Java program that finds the largest and smallest numbers in an array. 
// Requirements: 
// • - Prompt the user to enter array elements. 
// • - Create methods findMax and findMin. 
// • - Print the largest and smallest values. 
// Example Run: 
// Input: [4, 9, 2, 7] 
// Output: Max=9, Min=2 
// import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static double min(double[] array) {
        double minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }

        }
        return minimum;
    }


    static double max(double[] array) {
        double maximum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }

        }
        return maximum;
    }

    public static void main(String[] args) throws Exception {

        System.out.print("How many elements in the array: ");

        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        if (length <= 0) {
            System.out.println("Array must contain at least one element.");
            scanner.close();
            return;
        }

        double[] array = new double[length];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter element #" + (i + 1) + ":");
            array[i] = scanner.nextDouble();
        }

        System.out.println("Max = " + max(array));
        System.out.println("Min = " + min(array));







        scanner.close();

    }
}

