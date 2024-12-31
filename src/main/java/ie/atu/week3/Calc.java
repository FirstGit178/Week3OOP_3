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

        //Perform the operation
        boolean validOperation = true;
        double result = switch (operation){

            // addition
            case "add" -> {
                System.out.println("The result is " + (firstNum + secondNum));
                yield firstNum + secondNum;
            }
            // subtraction
            case "subtract" -> {
                System.out.println("The result is " + (firstNum - secondNum));
                yield firstNum - secondNum;
            }
            // multiplaction
            case "multiply" -> {
                System.out.println("The result is " + (firstNum * secondNum));
                yield firstNum * secondNum;
            }
            // division
            case "divide" -> {
                System.out.println("The result is " + (firstNum / secondNum));
                yield firstNum / secondNum;
            }
            // default if anything except valid option is selected //yield in default case
            default -> {
                System.out.println("Invalid operation.");
                yield 0;
            }

        };
    }
}