import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        while (b > 0) {
            a += 1;
            b -= 1;
        }
        System.out.println("Sum of two numbers is " + a);
    }
}
