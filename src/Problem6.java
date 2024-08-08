public class Problem6 {
    public static void main(String[] args) {
        int i = 1, sum = 0;
        while (i <= 50) {
            if (i % 2 == 0) {
                sum += i;
            }
            i += 1;
        }
        System.out.println("Sum of first 50 even numbers is: " + sum);
    }
}
