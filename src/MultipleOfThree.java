import java.util.Scanner;

public class MultipleOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        sc.close();
        System.out.println("Multiples of 3 from O to " + number + " are :");
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
