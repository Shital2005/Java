public class factorialArray {
    static int multiply(int x, int [] res, int res_size) {
        int carry = 0; // Initialize carry

        // One by one multiply n with individual digits of res[]
        for (int i = 0; i < res_size; i++) {
            int prod = res[i] * x + carry;
            res[i] = prod % 10; // Store last digit of prod in res[]
            carry = prod / 10; // Put rest in carry
        }

        // Put remaining carry in res[]
        while (carry != 0) {
            res[res_size] = carry % 10;
            carry = carry / 10;
            res_size++;
        }
        return res_size;
    }

    static String factorial(int n) {
        int[] res = new int[500]; // To store the result
        res[0] = 1; // Initialize result

        int res_size = 1; // Initialize size of result

        // Compute factorial
        for (int x = 2; x <= n; x++) {
            res_size = multiply(x, res, res_size);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = res_size - 1; i >= 0; i--) {
            sb.append(res[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int n = 100; // Example input
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }
}
