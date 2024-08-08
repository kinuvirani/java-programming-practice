
public class Problem4 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 50) {
            if (i % 2 != 0) {
                System.out.println("Odd number is " + i);
            }
            i += 1;
        }
    }
}

//Note: if I want to use array, how can I push numbers? int [] arr = {};