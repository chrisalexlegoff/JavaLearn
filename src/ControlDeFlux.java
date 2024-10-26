import java.util.Scanner;

public class ControlDeFlux {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age: ");
        int age = sc.nextInt();

        // Condition simple
        if (age >= 18) {
            System.out.println("Vous êtes majeur.");
        } else {
            System.out.println("Vous êtes mineur.");
        }

        // Boucle for
        System.out.println("Displaying numbers 1 to 5 with a for loop :");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Boucle while
        System.out.println("Displaying numbers 1 to 10 with a while loop:");
        int number = 0;
        while (number <= 10) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;
        }
    }
}
