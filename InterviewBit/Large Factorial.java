import java.math.*;

public class Solution {
    public String solve(int A) {
        BigInteger fact = BigInteger.ONE;
        for(int i=2; i<=A; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return String.valueOf(fact);
    }
}
