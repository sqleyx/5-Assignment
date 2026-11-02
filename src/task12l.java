import java.util.Scanner;

public class task12l {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int petya = sc.nextInt();
        int position = 1;

        for (int i = 0; i < n; i++) {
            if (a[i] >= petya) {
                position++;
            }
        }

        System.out.println(position);
    }
}
