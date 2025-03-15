public class InterviewBit {
    public static void main(String[] args){
       int[][] 2dArray = new int[2][];
      2dArray[0] = new int[3];
       2dArray[1] = new int[4];
       int counter = 0;
       for(int row=0; row <2dArray.length; row++){
          for(int col=0; col < 2dArray[row].length; col++){
             2dArray[row][col] = counter++;
          }
       }
       for(int row=0; row < 2dArray.length; row++){
          System.out.println();
          for(int col=0; col < 2dArray[row].length; col++){
             System.out.print(2dnArray[row][col] + " ");
          }
       }
    }
  }