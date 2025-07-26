package Array_Math;
public class Solution {
    static int MAXC = 3;        // 3 colors: 'r', 'g', 'b'
    static int MAXN = 1009;     // Max possible columns

    // Color index map: 'r' -> 0, 'g' -> 1, 'b' -> 2
    static int mapColor(char c) {
        if (c == 'r') return 0;
        if (c == 'g') return 1;
        return 2; // 'b'
    }

    public int solve(String[] A) {
        int rows = A.length;
        int cols = A[0].length();

        // Arrays to track position of each color
        int[] leftMost = new int[MAXC];  // leftMost[c] = left-most column with color c
        int[] rightMost = new int[MAXC]; // rightMost[c] = right-most column with color c
        int[][] top = new int[MAXC][cols];    // top[c][j] = topmost row of color c in column j
        int[][] bottom = new int[MAXC][cols]; // bottom[c][j] = bottommost row of color c in column j

        // Initialize
        for (int c = 0; c < MAXC; c++) {
            leftMost[c] = Integer.MAX_VALUE;
            rightMost[c] = -1;
            for (int j = 0; j < cols; j++) {
                top[c][j] = Integer.MAX_VALUE;
                bottom[c][j] = -1;
            }
        }

        // Fill leftMost and rightMost per color
        for (int i = 0; i < rows; i++) {
            String row = A[i];
            for (int j = 0; j < cols; j++) {
                int color = mapColor(row.charAt(j));
                leftMost[color] = Math.min(leftMost[color], j);
                rightMost[color] = Math.max(rightMost[color], j);
            }
        }

        // Fill top and bottom per color per column
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                int color = mapColor(A[i].charAt(j));
                top[color][j] = Math.min(top[color][j], i);
                bottom[color][j] = Math.max(bottom[color][j], i);
            }
        }

        double maxArea = 0.0;

        // Now try all combinations of top and bottom colors in each column
        for (int j = 0; j < cols; j++) {
            for (int x = 0; x < 3; x++) {         // top color
                for (int y = 0; y < 3; y++) {     // bottom color
                    if (x == y) continue;         // skip if same color
                    int z = 3 - x - y;            // third color

                    // Check if we can form a triangle with top[x][j] and bottom[y][j]
                    if (top[x][j] == Integer.MAX_VALUE || bottom[y][j] == -1)
                        continue;

                    int height = bottom[y][j] - top[x][j] + 1;

                    // Try left-side base (third vertex)
                    if (leftMost[z] != Integer.MAX_VALUE) {
                        int base = Math.abs(j - leftMost[z]) + 1;
                        double area = 0.5 * height * base;
                        maxArea = Math.max(maxArea, area);
                    }

                    // Try right-side base (third vertex)
                    if (rightMost[z] != -1) {
                        int base = Math.abs(rightMost[z] - j) + 1;
                        double area = 0.5 * height * base;
                        maxArea = Math.max(maxArea, area);
                    }
                }
            }
        }

        // Return ceiling of the area
        return (int) Math.ceil(maxArea);
    }
}
