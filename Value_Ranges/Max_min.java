package Value_Ranges;
public class Solution {
    public int solve(int[] A) {
        int n = A.length;

        // If only one element, return it twice
        if (n == 1) {
            return 2 * A[0];
        }

        int max, min;
        int i;

        // Initialize min and max
        if (n % 2 == 0) {
            if (A[0] > A[1]) {
                max = A[0];
                min = A[1];
            } else {
                max = A[1];
                min = A[0];
            }
            i = 2;
        } else {
            max = min = A[0];
            i = 1;
        }

        // Process pairs
        while (i < n - 1) {
            int localMax, localMin;
            if (A[i] > A[i + 1]) {
                localMax = A[i];
                localMin = A[i + 1];
            } else {
                localMax = A[i + 1];
                localMin = A[i];
            }

            if (localMax > max) max = localMax;
            if (localMin < min) min = localMin;

            i += 2;
        }

        return max + min;
    }
}

