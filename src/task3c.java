import java.util.Scanner;

public class task3c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}