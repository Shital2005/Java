import java.util.*; // imports all utility classes like Map, HashMap, TreeSet, etc.

class Solution {

    public int countCoveredBuildings(int n, int[][] buildings) {
        // 1. Create maps to group buildings by row and column
        Map<Integer, TreeSet<Integer>> rowMap = new HashMap<>();
        Map<Integer, TreeSet<Integer>> colMap = new HashMap<>();

        // 2. Populate the maps with building coordinates
        for (int[] b : buildings) {
            int x = b[0]; // row number
            int y = b[1]; // column number

            // Add column y to rowMap under row x
            rowMap.computeIfAbsent(x, k -> new TreeSet<>()).add(y);

            // Add row x to colMap under column y
            colMap.computeIfAbsent(y, k -> new TreeSet<>()).add(x);
        }

        int count = 0; // to count covered buildings

        // 3. Check each building to see if it's covered
        for (int[] b : buildings) {
            int x = b[0];
            int y = b[1];

            // Use TreeSet's lower() and higher() to check for neighbors
            boolean hasLeft = rowMap.get(x).lower(y) != null;
            boolean hasRight = rowMap.get(x).higher(y) != null;
            boolean hasUp = colMap.get(y).lower(x) != null;
            boolean hasDown = colMap.get(y).higher(x) != null;

            // If all four directions are covered
            if (hasLeft && hasRight && hasUp && hasDown) {
                count++;
            }
        }

        return count; // return the final count
    }
}
