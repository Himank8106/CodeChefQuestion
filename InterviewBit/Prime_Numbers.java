/* Link - public class Solution {
       public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
   
    public int[] sieve(int A) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= A; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        int[] result = new int[primes.size()];
        for (int i = 0; i < primes.size(); i++) {
            result[i] = primes.get(i);
        }
        return result;
    }
}
