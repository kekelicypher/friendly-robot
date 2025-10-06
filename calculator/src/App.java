
// Project 1: Simple Calculator
// Background: Calculators are one of the first programs many programmers build. 
//  This project will help you practice using methods and arithmetic operations.
// Task: Write a Java program that performs addition, subtraction, multiplication, and division.
// Requirements:
// •
// - Prompt the user to enter two numbers.
// •
// - Ask the user to choose an operation (+, -, *, /).
// •
// - Create separate methods for each operation.
// •
// - Display the result of the chosen operation.
import java.util.Scanner;
class App{
    static double multiplication(double first, double second) {
       double result = first * second;
       return result;
    }
    static double addition(double first, double second) {
       double result = first + second;
       return result;
    }
    static double subtraction(double first, double second) {
       double result = first - second;
       return result;
    }
    static double division(double first, double second) {
       double result = first / second;
       return result;
    }

    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        
        Scanner scanner = new Scanner(System.in);
        double firstNum = scanner.nextDouble();
        double secondNum = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Enter an operation (+, -, *, /): ");
        String operation = scanner.nextLine();

        if(operation.equals("*")) {
            System.out.print("Result: " + multiplication(firstNum, secondNum));
        }
        else if(operation.equals("+")) {
            System.out.print("Result: " + addition(firstNum, secondNum));
        }

        else if(operation.equals("-")) {
            System.out.print("Result: " + subtraction(firstNum, secondNum));
        }

        else if(operation.equals("/")) {
            System.out.print("Result: " + division(firstNum, secondNum));
        }
        
        

        

        scanner.close();


    }
 {
    
}
}