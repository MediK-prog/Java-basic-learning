import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String response;

        while (true) {
            System.out.println("Enter two numbers: ");
            double num1 = scn.nextDouble();
            double num2 = scn.nextDouble();

            System.out.println("Addition: " + (num1 + num2));
            System.out.println("Subtraction: " + (num1 - num2));
            System.out.println("Multiplication: " + (num1 * num2));

            if (num2 != 0) {
                System.out.println("Division: " + (num1 / num2));
            } else {
                System.out.println("Cannot divide by zero!");
            }


            while (true) {
                System.out.println("New calculation? (Type 'Yes' to continue or 'No' to exit)");
                response = scn.next();

                if (response.equalsIgnoreCase("Yes")) {
                    break;
                } else if (response.equalsIgnoreCase("No")) {
                    System.out.println("Program terminated.");
                    scn.close();
                    return;
                } else {
                    System.out.println("Invalid input! Please enter 'Yes' or 'No'.");
                }
            }
        }
    }
}
