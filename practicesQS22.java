// Find the Missing Number in an Array
import java.util.Scanner;

public class practicesQS22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        int total = N * (N + 1) / 2;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int missing = total - sum;

        System.out.println("Missing Number: " + missing);
    }
}