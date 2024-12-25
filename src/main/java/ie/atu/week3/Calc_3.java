package ie.atu.week3;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

        // Prompt the user for a number
        // Prompt the user for a second number
        // Display the total to the screen
        Scanner scan1 = new Scanner(System.in);
        // Please enter first number
        System.out.println("Please enter a number: ");
        double firstNum = scan1.nextDouble();
        System.out.println("You entered " + firstNum);

        // Please enter second number
        System.out.println("Please enter second number: ");
        double secondNum = scan1.nextDouble();
        System.out.println("You entered " + secondNum);

        //Please select an operation (add, subtract, multiply, divide )
        System.out.print("Choose an operation \n(add, subtract, multiply, divide ): ");
        String operation = scan1.next();

    }
}