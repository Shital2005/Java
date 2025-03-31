import java.util.*;

public class bubbleSort {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);

        // Get the number of elements from the user
        System.out.println("Enter the number of elements in the array: ");
        String input = sc.nextLine();  // Read input as string
        n = Integer.parseInt(input);   // Convert to integer

        int arr[] = new int[n];

        // Get the elements of the array from the user
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            input = sc.nextLine();  // Read each element as string
            arr[i] = Integer.parseInt(input);  // Convert to integer
        }

        // Bubble Sort algorithm
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;  // Use primitive boolean here
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;  // Mark that a swap occurred
                }
            }

            // If no elements were swapped, the array is already sorted
            if (!swapped) {
                break;
            }
        }

        // Output the sorted array
        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
