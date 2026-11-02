import java.util.Scanner;

public class task5e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int previous = sc.nextInt();
        boolean found = false;

        for (int i = 1; i < n; i++) {
            int current = sc.nextInt();

            if ((current > 0 && previous > 0) ||
                    (current < 0 && previous < 0)) {
                found = true;
            }

            previous = current;
        }

        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
