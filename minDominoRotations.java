public class minDominoRotations {
    public static int minDominoRotations(int[] tops, int[] bottoms) {

      int a = tops[0], b = bottoms[0];

      if(a==b)return check(a, tops, bottoms);

        int resA = check(a, tops, bottoms);
        int resB = check(b, tops, bottoms);

        if(resA == -1)return resB;
        if(resB == -1)return resA;
        return Math.min(resA, resB);
        
    }

    public static int check(int x, int[] tops, int[] bottoms) {

        int rotateTop= 0, rotateBottom = 0;

        for (int i = 0; i < tops.length; i++) {

            if (tops[i] != x && bottoms[i] != x) return -1;

            if (tops[i] != x) rotateTop++;
            else rotateBottom++;
        }
        return Math.min(rotateTop, rotateBottom);
    }

    public static void main(String[] args) {
        int[] tops = {2, 1, 2, 4, 2, 2};
        int[] bottoms = {5, 2, 6, 2, 3, 2};
        System.out.println(minDominoRotations(tops, bottoms)); // Output: 2
    }

}
