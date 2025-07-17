  import java.util.*;
  public class Anagrams {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of words
        int n = sc.nextInt();
        String[] words = new String[n];

        // Read all words
        for (int i = 0; i < n; i++) {
            words[i] = sc.next().trim();  // Remove leading/trailing spaces
        }

        // Map to group anagrams by sorted key
        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            String sorted = sortString(word);  // Sorted version of word

            // Add the word to the corresponding anagram group
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(word);
        }

        // Print grouped anagrams
        for (List<String> group : map.values()) {
            System.out.println(String.join(" ", group));
        }
    }

    // Helper to sort characters in a string
    public static String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}


