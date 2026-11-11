// QS. Find Union of Two Arrays

import java.util.Scanner;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            set.add(sc.nextInt());
        }

        System.out.println(set);
    }
}