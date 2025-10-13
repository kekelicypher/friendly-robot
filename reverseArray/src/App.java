// Project 12: Array Reverser
// Background: Reversing arrays is a common task in coding interviews. This project will help you practice loops and arrays.
// Task: Write a Java program that reverses an array.
// Requirements:
// •
// - Prompt the user to enter array elements.
// •
// - Create a method reverseArray that prints the reversed array.
// •
// - Do not use built-in reverse methods.
// Example Run: Input: [1,2,3,4] Output: [4,3,2,1]

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter the number of elements in the array: ");

        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        double[] array = new double[length];

        
        for(int i = 0; i < length; i++) {
            System.out.print("Enter #" + (i + 1 ) + ": ");
            array[i] = scanner.nextDouble();
        }

        reverseArray(array);

        scanner.close();
    }
    static void reverseArray(double[] array) {

        int m = array.length;
        int n = 0;

        double[] newArray = new double[m];

        for(int i = m-1; i >= 0; i--){
            newArray[n] = array[i];
            n++;            
        }

        for(int j = 0; j < newArray.length; j++) {
            System.out.print(newArray[j]+" ");
        }


    }
}
