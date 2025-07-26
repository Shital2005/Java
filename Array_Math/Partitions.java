package Array_Math;
public class Partitions {   
    public int solve(int A,int[] B){
        for(int i = 0;i<A;i++){
            total += B[i];
        }
        int prefixSum = 0;
        int partSum = total/3;
        int count = 0;
        int ways = 0;

        for(int i=0;i<A-1;i++){
            prefixSum+= B[i];

            if(prefixSum == partSum){
                count++;
            }
            if(prefixSum == 2 * partSum){
                ways += count;
            }
        }
        return ways;

    }
}
