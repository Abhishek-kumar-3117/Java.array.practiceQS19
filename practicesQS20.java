// Q. Remove duplicates from a sorted array

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                System.out.print(arr[i - 1] + " ");
            }
        }

        System.out.println(arr[n - 1]);
    }
}