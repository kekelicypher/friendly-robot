// Project 14: Linear Search
// Background: Searching for an element is a common problem. This project will help you practice arrays and loops.
// Task: Write a Java program that performs linear search.
// Requirements:
// •
// - Prompt the user to enter an array and a key.
// •
// - Search for the key in the array.
// •
// - Print whether the key is found.
// Example Run: Input: [1,2,3,4], key=3 Output: Found
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many # in the array? ");

        int num = scanner.nextInt();

        int[] array = new int[num];

        for(int i = 0; i < num; i++){
            System.out.print("Enter #" + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Ener a key to search the array: ");
        int keyword = scanner.nextInt();

    
        boolean found = false;

        for(int i = 0; i < array.length; i ++) {

            if (array[i] == keyword) {
                found = true;
            }

        }

        if (found) {
            System.out.println("Found");
        }

        else {
            System.out.println("Keyword not found");
        }

        scanner.close();







    }

}
