// output:
// 0 1 2
// 3 4 5 6

// public class arrays {
//     public static void main(String[] args) {
//         int[][] arr = new int[2][];
//         arr[0] = new int[3];
//         arr[1] = new int[4];
//         int count = 0;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 arr[i][j] = count++;
//             }
//         }
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class arrays {
//     public static void main(String args[]) {
//        int array[] = {1, 2, 3, 4, 5};
//        System.out.println("Length of an array is: " + array.length);
//     }
//   }

// public class arrays {
//     public static void main(String args[]) {
//        String str = "Welcome to InterviewBit";
//        System.out.println("Length of String using length() method is: " + str.length());
//     }
//   }


//finding target element in an array


// import java.util.*;
// public class arrays{
//    public static void main(String args[])throws Exception{
//       Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       int [] arr = new int[n];
//       for (int i =0;i<n;i++){
//          arr[i] = sc.nextInt();
//       }
//       int target = sc.nextInt();
//       for(int i=0;i<arr.length;i++){
//          if (arr[i]== target){
//             System.out.println(i);
//             return;
//          }
//       }
//       System.out.println(-1);
//    }
// }

//largest and smallest 


// import java.util.*;
// public class arrays{
//    public static void main(String args[]){
//       int [] arr = {1,2,3,4,5};
//       int max = arr[0];
//       int min = arr[0];

//       for(int number:arr){
//          if(number>max){
//             max = number;
//          }
//          else if(min>number){
//             min = number ;
//          }
//       }
//       System.out.println(max);
//       System.out.println(min);
//    }
// }



