import java.util.LinkedList;

public class SegregateArray {
    public static void main (String[] args){

        int[] arr = {1,1,0,0,1,0,1,0};

        LinkedList<Integer> ll = new LinkedList<>();

        for(int i = 0;i<arr.length;i++){

            if(arr[i]==0){

                ll.addFirst(arr[i]);
            }
            else{
                ll.addLast(arr[i]);
            }
        }
        System.out.println(ll);
    }
}
