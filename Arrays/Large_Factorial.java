package Arrays;

public class Large_Factorial {
    public String solve(int A) {
        String s1 = "1", s2 = "";
        for(int i = 2;i<=A;i++){
            int c = 0;
            for(int j = s1.length()-1;j>=0;j--){
                int x = Integer.parseInt(s1.substring(j,j+1))*i+c;
                s2 = Integer.toString(x%10) + s2;
                c = x/10;
            }
            if(c!=0) s2 = Integer.toString(c)+s2;
            s1 = s2;
            s2 = "";
        }
        return s1;
    }
}
