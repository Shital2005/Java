package Array_Math;

public class Max_Sum_Contagious {
    public int maxSubArray(final int[] A) {
        
        int maxSoFar = A[0];
        int currentMax = A[0];
        
        for(int i = 1;i<A.length;i++){
            currentMax = Math.max(A[i],currentMax+A[i]);
            maxSoFar = Math.max(currentMax,maxSoFar);   
        }
        return maxSoFar;
    }
}


