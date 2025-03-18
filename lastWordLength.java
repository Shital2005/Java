public class lastWordLength {
    public int lengthOfLastWord(String s) {
        s= s.trim();
        int lastSpaceIndex = s.lastIndexOf(" ");
        return s.length()- lastSpaceIndex -1 ;
    }
}
