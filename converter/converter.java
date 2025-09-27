package converter;

// package converter;
// Unit Converter
// Background:
// Conversions between units are common in everyday life (e.g., Celsius to Fahrenheit). This
// project will help you practice methods and basic math.
// Task:
// Write a Java program that converts units.
// Requirements:
// • - Prompt the user to choose a conversion type (e.g., Celsius ↔ Fahrenheit, kilometers ↔
// miles).
// • - Create methods for each conversion.
// • - Display the converted value.
// Example Run:
// Input: 0 Celsius
// Output: 32 Fahrenheit

import java.util.Scanner;

class converter{

    static double convert(double temperature) {
        double fahrenheit = (temperature * (9.0/5.0) + 32);
        return fahrenheit;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter temperature in Degrees: ");


        double temperature = scanner.nextDouble();

        System.out.println("Fahrenheit: " + convert(temperature));










        scanner.close();
    }
}