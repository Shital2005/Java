package Array_Math;
public class Solution {
    public int maxAbs(int[] A) {
       int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++) {
            int p = A[i] + i;
            int q = A[i] - i;

            max1 = Math.max(max1, p);
            min1 = Math.min(min1, p);

            max2 = Math.max(max2, q);
            min2 = Math.min(min2, q);
        }

        return Math.max(max1 - min1, max2 - min2);
    }
}
