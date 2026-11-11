// Find Common Elements in Two Arrays

import java.util.Scanner;

public class practicesQS24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        System.out.print("Common elements: ");

        for (int i = 0; i < n; i++) {
            boolean found = false;

            for (int j = 0; j < m; j++) {
                if (a[i] == b[j]) {
                    found = true;
                    break;
                }
            }

            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (a[k] == a[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (found && !alreadyPrinted) {
                System.out.print(a[i] + " ");
            }
        }
    }
}