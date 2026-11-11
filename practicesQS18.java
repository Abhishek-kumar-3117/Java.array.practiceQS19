public class Main {
    public static void main(String[] args) {
        int[] arr = {10, -5, 0, 20, -8, 0, 7};

        int pos = 0, neg = 0, zero = 0;

        for (int n : arr) {
            if (n > 0)
                pos++;
            else if (n < 0)
                neg++;
            else
                zero++;
        }

        System.out.println("Positive: " + pos);
        System.out.println("Negative: " + neg);
        System.out.println("Zero: " + zero);
    }
}