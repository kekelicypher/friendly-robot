// Project 15: Sorting Program (Bubble Sort)
// Background: Sorting is one of the most common algorithms in computer science. This project will help you practice nested loops and arrays.
// Task: Write a Java program that sorts an array using bubble sort.
// Requirements:
// •
// - Prompt the user to enter array elements.
// •
// - Use bubble sort logic.
// •
// - Print the sorted array.

// Example Run: Input: [4,2,7,1] Output: [1,2,4,7]

import java.util.Scanner;

public class App {
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
            System.out.print("Enter element #" + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }

        double temp = 0;

        for (int j = 0; j < length-1; j++) {
            for(int i = 0; i < length-1; i++) {
                if (array[i] > array[i + 1]) {

                    temp = array[i];

                    array[i] = array[i + 1];

                    array[i + 1] = temp;
            }
        }

        }

        for(double number:array) {
            System.out.print(number + " ");
        }


        scanner.close();
    }


}
