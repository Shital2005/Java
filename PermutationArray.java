public class PermutationArray {

    // Method to build the array from the permutation
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
        // Populate the 'ans' array based on the given formula: ans[i] = nums[nums[i]]
        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];  // Use nums[nums[i]] as the value for ans[i]
        }
        
        return ans;
    }

    // Main method to test the buildArray function
    public static void main(String[] args) {
        // Create an instance of PermutationArray
        PermutationArray solution = new PermutationArray();
        
        // Test Case 1
        int[] nums1 = {0, 2, 1, 5, 3, 4};
        int[] result1 = solution.buildArray(nums1);
        System.out.println(java.util.Arrays.toString(result1));  // Expected Output: [0, 1, 2, 4, 5, 3]
        
        // Test Case 2
        int[] nums2 = {5, 0, 1, 2, 3, 4};
        int[] result2 = solution.buildArray(nums2);
        System.out.println(java.util.Arrays.toString(result2));  // Expected Output: [4, 5, 0, 1, 2, 3]
    }
}
