import java.util.Arrays;

public class maxNonNegative {
    public int[] maxset(int[] A){
        int maxsum=0,maxstart=-1,maxlen=0;
        int tempsum=0,tempstart=0,templen = 0;
        for(int i = 0;i<A.length;i++){
            if(A[i]>+0){
                tempsum+= A[i];
                templen ++;
            }
            else{
                if(tempsum>maxsum || (tempsum==maxsum && templen>maxlen)){
                    maxsum= tempsum;
                    maxstart = tempstart;
                    maxlen = templen;
                }
                tempsum = 0;
                tempstart = i+1;
                templen = 0;

            }
        }
        if(tempsum>maxsum || (tempsum==maxsum && templen>maxlen)){
            maxstart = tempstart;
            maxlen = templen;
        }
        if(maxstart == -1){
            return new int[0];
        }
        int[] result = new int[maxlen];
        for(int i = 0;i<maxlen;i++){
            result[i] = A[maxstart+i];
        }
        return result;
        //     return Arrays.copyOfRange(A, maxStart, maxStart + maxLen);
    }

      public static void main(String[] args) {
        maxNonNegative sol = new maxNonNegative();
        
        int[] A1 = {1, 2, 5, -7, 2, 3};
        int[] A2 = {10, -1, 2, 3, -4, 100};
        
        System.out.println(Arrays.toString(sol.maxset(A1))); // Output: [1, 2, 5]
        System.out.println(Arrays.toString(sol.maxset(A2))); // Output: [100]
    }
}
