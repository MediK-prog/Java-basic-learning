public class ElementaryArithmetic {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return (double) a / b;
    }
    public void evenandodd1(int a){
        if (a % 2 == 0){
            System.out.println(a+"is even");

        }
        else {
            System.out.println(a+"is odd");
        }


    }
    public void evenandodd2(int b){
        if (b % 2 == 0){
            System.out.println(b+"is even");

        }
        else {
            System.out.println(b+"is odd");
        }


    }

}
