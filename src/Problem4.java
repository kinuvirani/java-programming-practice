
public class Problem4 {
    public static void main(String[] args) {
        int i = 1, count = 0;
        while (count < 50) {
            if (i % 2 != 0) {
                count += 1;
                System.out.print(i + " ");
            }
            i += 1;
        }
    }
}

//Note: if I want to use array, how can I push numbers? int [] arr = {};