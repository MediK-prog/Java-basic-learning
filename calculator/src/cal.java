import java.util.Scanner;

public class cal {
    public static void calcode(String[]calcode){

        int num1;
        int num2;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter two numbers : ");

        while (true) {
            num1 = scn.nextInt();
            num2 = scn.nextInt();

            int Addition = num1 + num2;
            System.out.print(Addition);

            int Subtraction = num1 - num2;
            System.out.print(Subtraction);

            int Multiplication  = num1 * num2;
            System.out.print(Multiplication);

            double Division = num1 / num2;
            System.out.print(Division);

            System.out.print("New calculation?    Yes/No");
            String  Response ;
            Response = scn.next();

                if (Response == "Yes") {
                    continue;
                }
                if (Response == "No"){
                    break;
                }
        }

    }
}
