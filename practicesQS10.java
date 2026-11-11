// Find the power of a number without using Math.pow()

class Main {
    public static void main(String[] args) {
        int base = 2, exp = 5, result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        System.out.println(result);
    }
}