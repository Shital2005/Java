public class MinSteps {
    public int coverPoints(int[] A, int[] B) {
        int steps = 0;
        for (int i = 1; i < A.length; i++) {
            int dx = Math.abs(A[i] - A[i - 1]);
            int dy = Math.abs(B[i] - B[i - 1]);
            steps += Math.max(dx, dy);
        }
        return steps;
    }

    public static void main(String[] args) {
        MinSteps sol = new MinSteps();
        int[] A = {0, 1, 1};
        int[] B = {0, 1, 2};
        System.out.println(sol.coverPoints(A, B));  // Output: 2
    }
}
