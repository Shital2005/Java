public class InterviewBit {
   public static void main(String[] args) {
       int[][] array2D = new int[2][];  // Corrected variable name
       array2D[0] = new int[3];
       array2D[1] = new int[4];

       int counter = 0;
       for (int row = 0; row < array2D.length; row++) {
           for (int col = 0; col < array2D[row].length; col++) {
               array2D[row][col] = counter++;
           }
       }

       for (int row = 0; row < array2D.length; row++) {
           System.out.println();  // Print new line for each row
           for (int col = 0; col < array2D[row].length; col++) {
               System.out.print(array2D[row][col] + " ");  // Fixed variable name
           }
       }
   }
}
