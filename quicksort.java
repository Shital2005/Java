public class quicksort {

    void  swap(int arr[],int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    int partition(int arr[],int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j = low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
  
    void sort(int[] arr,int low,int high){
        if(low<high){
            int q = partition(arr,low,high);
            sort(arr,low,q-1);
            sort(arr,q+1,high);
        }
    }

    static void printArray(int arr[]){
        
        for(int num : arr){
            System.out.println(num + " ");

        }
        System.out.println();

    }
    
    public static void main(String args[]){
        int[] arr = {10,7,8,9,1,5};
        int  n = arr.length;
        quicksort ob = new quicksort();
        ob.sort(arr,0,n-1);
        System.out.println("Sorted Array:");
        printArray(arr);

    }



}
