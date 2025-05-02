import java.math.BigInteger;

public class factorialString {
    public String factorial(int n){
        if (n < 0) {
            return "Undefined";
        }
        BigInteger res = BigInteger.ONE;
        for(int i = 2; i <= n; i++){
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res.toString();
    }
    public static void main(String[] args) {
        factorialString fs = new factorialString();
        System.out.println(fs.factorial(3)); // Example usage
    }
}
