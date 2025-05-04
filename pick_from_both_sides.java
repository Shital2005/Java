class pick_from_both_sides {
    public int solve(int[] A, int B) {
        int n = A.length;
        int sum = 0;
        for (int i = 0; i < B; i++) {
            sum += A[i];
        }
        int maxSum = sum;

        int end = n - 1;
        for(int i = B-1; i >= 0; i--) {
            sum -= A[i];
            sum += A[end--];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}