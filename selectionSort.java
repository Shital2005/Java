public class SelectionSort {

    
    void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    
    int findMinIndex(int[] A, int start) {
        int min_index = start;
        for (int i = start + 1; i < A.length; i++) {  
            if (A[i] < A[min_index]) {  
                min_index = i;  
            }
        }
        return min_index;
    }

    
    void selectionSort(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int min_index = findMinIndex(A, i);  
            if (i != min_index) {
                swap(A, i, min_index);  
            }
        }
    }

    public static void main(String[] args) {
        int A[] = {5, 4, 3, 2, 1};
    
        SelectionSort sorter = new SelectionSort();
        sorter.selectionSort(A);  
     
        System.out.print("Sorted array: ");
        for (int num : A) {
            System.out.print(num + " ");
        }
        System.out.println();  
}
