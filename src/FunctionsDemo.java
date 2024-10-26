import java.util.Scanner;

public class FunctionsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int numberOne = sc.nextInt();
        System.out.println("Enter the second number: ");
        int numberTwo = sc.nextInt();
        sc.close();

        int resultAdd = add(numberOne, numberTwo);
        System.out.println("The sum is: " + resultAdd);

        int resultProduct = product(numberOne, numberTwo);
        System.out.println("The product is: " + resultProduct);

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int product(int a, int b) {
        return a * b;
    }
}
