import java.util.Scanner;

public class averaging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number one:");
        int a = sc.nextInt();
        System.out.println("Enter number two:");
        int b = sc.nextInt();
        System.out.println("Enter number three:");
        int c = sc.nextInt();
        sc.close();
        int[] numbers = {a,b, c};
        double average = averageCalc(numbers);
        System.out.println(average);
    }
    
    public static double averageCalc(int[] args) {
        double average = 0;
        for (int arg : args) average += arg;
        average /= args.length;
        return average;
    }
}
