import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        double numberOne = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double numberTwo = scanner.nextDouble();

        double somme = numberOne + numberTwo;
        System.out.println("The somme is: " + somme);
        double difference = numberOne - numberTwo;
        System.out.println("The difference is: " + difference);
        double product = numberOne * numberTwo;
        System.out.println("The product is: " + product);
        double quotient = numberOne / numberTwo;
        System.out.println("The quotient is: " + quotient);

        scanner.close();
    }
}
