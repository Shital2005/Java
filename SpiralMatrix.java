import java.util.*;
public class SpiralMatrix{
    public static ArrayList<Integer> spiralOrder(int [][] A){
        ArrayList<Integer> result = new ArrayList<Integer>();

        if(A == null || A.length == 0 ){
            return result;
        }

        int top = 0, bottom = A.length-1, left = 0, right = A[0].length -1;

        while(top<=bottom && left<=right){
            
            for(int i = left;i<= right; i++){
                result.add(A[top][i]);
                
            }
            top ++;

            for(int i = top;i<=bottom; i++){
                result.add(A[i][right]);
              
            }
            right --;

            if(top<=bottom){
                for(int i = right; i >= left; i--){
                    result.add(A[bottom][i]);
                  
                }
                bottom --;
            }

            if(left <= right){
                for(int i = bottom;i>= top; i--){
                    result.add(A[i][left]);
                  
                }
                left ++;
            }
        }
        return result;
    }

    public static void main(String args[]){
        int [][] A = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println(spiralOrder(A));
    }
}