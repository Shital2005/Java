package Array_Math;
import java.util.*;

public class triplet {

    public int solve(int[] A) {
        int n = A.length;

        if (n < 3) return 0;

        int[] rightMax = new int[n];
        rightMax[n - 1] = A[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(A[i], rightMax[i + 1]);
        }

        TreeSet<Integer> leftSet = new TreeSet<>();
        leftSet.add(A[0]);

        int maxSum = 0;

        for (int j = 1; j < n - 1; j++) {
            if (A[j] < rightMax[j + 1]) {
                Integer smaller = leftSet.lower(A[j]);
                if (smaller != null) {
                    int sum = smaller + A[j] + rightMax[j + 1];
                    maxSum = Math.max(maxSum, sum);
                }
            }
            leftSet.add(A[j]);
        }

        return maxSum;
    }
    public static void main(String[] args) {
        triplet obj = new triplet();
        int[] A = {2, 5, 3, 1, 4, 9};
        System.out.println(obj.solve(A));  // Output: 16
    }
}
