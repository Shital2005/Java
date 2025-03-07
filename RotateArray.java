import java.util.*;

public class RotateArray{

    public static void rotateRight(int[] arr,int k){
    int n = arr.length;
    k = k%n; //k>n
    if(k<0) k+=n; //convert negative to equi positive

    reverse(arr,0,n-1);
    reverse(arr,0,k-1);
    reverse(arr,k,n-1);

    }

    public static void rotateLeft(int[] arr, int k){
        rotateRight(arr,-k);
    }

    public static void reverse(int[] arr , int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;
            start ++;
            end --;  
        }    
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();

        }

        int k = sc.nextInt();

        if(k>0){
            rotateRight(arr,k);
        }
        else if(k<0){
            rotateLeft(arr,k);
        }

        System.out.println(Arrays.toString(arr));

        sc.close();

    }
}
