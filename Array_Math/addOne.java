package Array_Math;
public class addOne {
    public int[] plusOne(int[] A) {
        int n = A.length;
        for (int i = n - 1; i >= 0; i--) {
            if (A[i] < 9) {
                A[i]++;
               return trim(A);
            }
            A[i] = 0;
        }
        // If we reach here, it means all digits were 9
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    private int[] trim(int[] A) {
        int i = 0;

        while (i < n && A[i] == 0) {
            i++;
        }
        if (i == n) {
            return new int[]{0};
        }
        int[] trimmed = new int[n - i];
        System.arraycopy(A, i, trimmed, 0, n - i);
        return trimmed;
    }
}

  
