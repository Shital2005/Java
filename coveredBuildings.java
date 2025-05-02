import java.util.*;
class Solution{
    public int countCoveredBuildings(int n, int [][] buildings){

        Map<Integer, TreeSet<Integer>> rowMap = new HashMap<>();
        Map<Integer, TreeSet<Integer>> colMap = new HashMap<>();

        for(int[] b :buildings){
            int x = b[0];
            int y = b[1];

            rowMap.computeIfAbsent(x, k -> new TreeSet<>()).add(y);
            colMap.computeIfAbsent(y, k -> new TreeSet<>()).add(x);

        }

        int count = 0;

        for(int [] b :buildings){
            int x = b[0];
            int y = b[1];

            boolean left = rowMap.get(x).lower(y)!= null;
            boolean right = rowMap.get(x).higher(y)!= null;
            boolean up = colMap.get(y).lower(x)!= null;
            boolean down = colMap.get(y).higher(x)!= null;

            if(left && right && up && down){
                count++;
            }

        }
        return count;

    }
}