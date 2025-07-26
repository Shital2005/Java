package Value_Ranges;

public class Solution {
    public int solve(int[] A) {
        // Handle edge case: single element
        if (A.length == 1) {
            return 2 * A[0];
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Single pass using built-in Math functions
        for (int num : A) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return min + max;
    }
}
