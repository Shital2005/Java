public class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        Set<String> buildingSet = new HashSet<>();

        for(int [] b :buildings){
            buildingSet.add(b[0]+","+b[1]);
        }

        int count = 0;
        for(int [] b :buildings){
           int x = b[0],y = b[1];
         boolean up = buildingSet.contains(x + "," + (y + 1));
boolean down = buildingSet.contains(x + "," + (y - 1));
boolean left = buildingSet.contains((x - 1) + "," + y);
boolean right = buildingSet.contains((x + 1) + "," + y);

            if(up && down && left && right){
            count ++;
        }
       
       
       
    }
     return count ;
    }
}
 coveredBuildings {
    
}
