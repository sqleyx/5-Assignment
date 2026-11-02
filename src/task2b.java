import java.util.Scanner;

public class task2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
        }
    }
}