// Project 8: Palindrome Checker
// Background:
// A palindrome is a word or number that reads the same forwards and backwards. This
// project will help you practice strings and loops.
// Task:
// Write a Java program that checks if an input string or number is a palindrome.
// Requirements:
// • - Prompt the user for input.
// • - Create a method isPalindrome(String input).
// • - Return true if the input is a palindrome.
// • - Print the result.
// Example Run:
// Input: racecar
// Output: Palindrome

import java.util.Scanner;


class App {

    public static void main(String[] args) {

        System.out.print("Enter a word: ");

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        if (isPalindrome(word)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");

        }
        scanner.close();
        
    }

    static boolean isPalindrome(String word) {
        String cleaned = word.toLowerCase();

        int left = 0;
        int right = cleaned.length()-1;

        while (left < right){
            if(cleaned.charAt(right) != cleaned.charAt(left)) {
                return false;

                
            }
            left++;
            right--;
            }

        return true;


        
    }
}