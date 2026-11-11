// Find Third Largest Element

import java.util.*;

public class practicesQS23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int count = 0;
        int previous = 0;
        boolean found = false;

        for (int i = n - 1; i >= 0; i--) {
            if (count == 0 || arr[i] != previous) {
                count++;
                previous = arr[i];

                if (count == 3) {
                    System.out.println("Third largest: " + arr[i]);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Third largest not found");
        }
    }
}