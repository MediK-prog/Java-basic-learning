import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ElementaryArithmetic calcu = new ElementaryArithmetic();

        String response;

        while (true) {
            System.out.println("Enter two numbers: ");
            int num1 = scn.nextInt();
            int num2 = scn.nextInt();
            calcu.evenandodd1(num1);
            calcu.evenandodd2(num2);
            System.out.println("Addition: " + calcu.add(num1, num2));
            System.out.println("Subtraction: " + calcu.subtract(num1, num2));
            System.out.println("Multiplication: " + calcu.multiply(num1, num2));

            if (num2 != 0) {
                double division = calcu.divide(num1, num2);
                System.out.printf("Division: %.3f\n", division);
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
