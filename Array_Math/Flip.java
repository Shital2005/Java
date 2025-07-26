package Array_Math;

public class Flip {

    public int[] flip(String A) {
        int n = A.length();
        int maxSum = 0, currSum = 0;
        int start = 0, end = -1, tempStart = 0;

        for (int i = 0; i < n; i++) {
            int val = (A.charAt(i) == '0') ? 1 : -1;
            currSum += val;

            if (currSum < 0) {
                currSum = 0;
                tempStart = i + 1;
            } else if (currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end = i;
            }
        }

        // If no beneficial flip was found
        if (end == -1) {
            return new int[0]; // return empty array
        }

        // Return 1-based indices as an int[]
        return new int[]{start + 1, end + 1};
    }
}


