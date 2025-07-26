package Array_Math;
public class MinLights {
    public int solve(int[] A, int B) {
        int n = A.length;
        int count = 0;
        int i = 0;

        while (i < n) {
            int left = Math.max(0, i - B + 1);
            int right = Math.min(n - 1, i + B - 1);
            boolean found = false;

            // Search for the rightmost working light within the range
            for (int j = right; j >= left; j--) {
                if (A[j] == 1) {
                    found = true;
                    count++;
                    i = j + B;
                    break;
                }
            }

            if (!found) {
                return -1; // No light can cover the current position
            }
        }

        return count;
    }

    public static void main(String[] args) {
        MinLights solution = new MinLights();

        // Test Case 1
        int[] A1 = {1, 0, 0, 0, 1};
        int B1 = 2;
        System.out.println(solution.solve(A1, B1)); // Expected Output: 3

        // Test Case 2
        int[] A2 = {1, 1, 1, 1, 0};
        int B2 = 2;
        System.out.println(solution.solve(A2, B2)); // Expected Output: -1
    }
}
