public class RepeatedSubstring {
    
        public boolean repeatedSubstringPattern(String s) {
            int len = s.length();
    
            for (int i = 1; i <= len / 2; i++) { // Loop up to half the string length
                if (len % i == 0) { // Check if the length is divisible by i
                    String sub = s.substring(0, i);
                    StringBuilder sb = new StringBuilder();
    
                    for (int j = 0; j < len / i; j++) {
                        sb.append(sub);
                    }
    
                    if (sb.toString().equals(s)) { // Check if the reconstructed string matches
                        return true;
                    }
                }
            }
            return false; // Return false only after checking all possibilities
        }
    
}
