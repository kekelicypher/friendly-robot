// Project 20: Password Strength Checker
// Background: Strong passwords are important for security. This project will help you practice strings and conditionals.
// Task: Write a Java program that checks password strength.
// Requirements:
// •
// - Prompt the user for a password.
// •
// - Check if it has at least 8 characters.
// •
// - Check if it contains digits and special characters.
// •
// - Print whether it is strong or weak.
// Example Run: Input: hello123 Output: Weak Input: Hello@123 Output: Strong

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);



        System.out.print("Enter your password: ");
        String password = scanner.nextLine(); 


        

        // Requirements:
        // - at least 8 characters
        // - contains at least one digit
        // - contains at least one special character (non-alphanumeric)

        boolean longEnough = password.length() >= 8;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecial = true;
            }
        }

        if (longEnough && hasDigit && hasSpecial) {
            System.out.println("Strong");
        } else {
            System.out.println("Weak");
            System.out.println("Reason(s):");
            if (!longEnough) System.out.println(" - Password must be at least 8 characters long.");
            if (!hasDigit) System.out.println(" - Password should contain at least one digit.");
            if (!hasSpecial) System.out.println(" - Password should contain at least one special character (e.g. @, #, !).");
        }

        scanner.close();
    }
}
