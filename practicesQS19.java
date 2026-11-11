public class practicesQS19 {
    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 1, 6};

        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int n : arr) {
            if (n < smallest) {
                second = smallest;
                smallest = n;
            } else if (n > smallest && n < second) {
                second = n;
            }
        }

        if (second == Integer.MAX_VALUE) {
            System.out.println("Second smallest not found");
        } else {
            System.out.println(second);
        }
    }
}