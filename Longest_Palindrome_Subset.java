public class Longest_Palindrome_Subset {
    
    public int longestPalinDrome(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int n = s.length();
        int[] dp = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            dp[i] = 1;
            int prev_val = 0;

            for (int j = i + 1; j < n; j++) {
                int temp = dp[j];
                if (s.charAt(i) == s.charAt(j)) {
                    dp[j] = 2 + prev_val;
                } else {
                    dp[j] = Math.max(dp[j], dp[j - 1]);
                }
                prev_val = temp;
            }
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        // Use a Scanner to read the input from the test case
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        Main mainObj = new Main();
        int length = mainObj.longestPalinDrome(input);
        
        // Print the final result
        System.out.println(length);
    }

}
