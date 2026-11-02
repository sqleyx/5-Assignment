import java.util.Scanner;

public class task15o {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int destroyed = 0;
        boolean changed = true;

        while (changed) {
            changed = false;

            for (int i = 0; i < n;) {
                int j = i + 1;

                while (j < n && a[j] == a[i]) {
                    j++;
                }

                if (j - i >= 3) {
                    destroyed += j - i;

                    for (int k = j; k < n; k++) {
                        a[k - (j - i)] = a[k];
                    }

                    n -= j - i;
                    changed = true;
                    break;
                }

                i = j;
            }
        }

        System.out.println(destroyed);
    }
}
