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
            calcu.evenandodd(num1);
            calcu.evenandodd(num2);
            calcu.add(num1,num2);
            calcu.subtract(num1,num2);
            calcu.multiply(num1,num2);
            calcu.divide(num1,num2);

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
