public class ElementaryArithmetic {
    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public void subtract(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    public void multiply(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    public void divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
        } else {
            double Div = (double) a / b;
            System.out.printf("Division: %.3f\n", Div);
        }
    }
    public void modulus(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot perform modulus by zero!");
        } else {
            double mod = (double) a % b;
            if (mod == (int) mod) {
                System.out.println("Modulus: " + (int) mod);
            } else {
                System.out.printf("Modulus: %.3f\n", mod);
            }
        }
    }
    public void isPrime(int number) {
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
            return;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println(number + " is not a prime number.");
                return;
            }
        }
        System.out.println(number + " is a prime number.");
    }



    public void evenandodd(int number){
        if (number % 2 == 0){
            System.out.println(number+" is even");

        }
        else {
            System.out.println(number+" is odd");
        }

    }

}
