import java.util.*;
public class target_sum {
    public int[] two_sum(int [] arr,int target){
        HashMap <Integer,Integer>hash = new HashMap<Integer,Integer>();
        
        for (int i = 0;i<arr.length;i++){
            int diff = target - arr[i];
            if(hash.containsKey(diff)){
                int to_Return[] = {hash.get(diff)+1,i+1};
                return to_Return;
        
            }
            hash.put(arr[i],i);
        }
        return null;
    }
    public static void main(String args[]){
        target_sum obj = new target_sum();
        int arr[] = {2,5,7,8};
        int target  = 10;
        int result[] = obj.two_sum(arr,target);
        if (result!= null){
            System.out.println(result[0] + " " + result[1]);
        }
        else{
            System.out.println("not found");
        }
        
        
    }
}
