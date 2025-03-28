public class SelectionSort {

    // Swap method to swap elements
    void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    // Find the index of the minimum element
    int findMinIndex(int[] A, int start) {
        int min_index = start;
        for (int i = start + 1; i < A.length; i++) {  // Corrected loop logic
            if (A[i] < A[min_index]) {
                min_index = i;  // Update min_index, not swap here
            }
        }
        return min_index;
    }

    // Selection sort implementation
    void selectionSort(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int min_index = findMinIndex(A, i);
            if (i != min_index) {
                swap(A, i, min_index);  // Swap the current element with the minimum found
            }
        }
    }

    public static void main(String[] args) {
        int A[] = {5, 4, 3, 2, 1};
        
        // Create an instance of SelectionSort to call the non-static method
        SelectionSort sorter = new SelectionSort();
        sorter.selectionSort(A);  // Call the selectionSort method
        
        // Print sorted array
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
