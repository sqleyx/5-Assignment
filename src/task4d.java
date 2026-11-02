import java.util.Scanner;

public class task4d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        int previous = sc.nextInt();

        for (int i = 1; i < n; i++) {
            int current = sc.nextInt();

            if (current > previous) {
                count++;
            }

            previous = current;
        }

        System.out.println(count);
    }
}