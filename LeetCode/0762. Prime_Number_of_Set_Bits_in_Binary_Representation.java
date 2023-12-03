/* Link - https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/ */

class Solution {
    public int countPrimeSetBits(int left, int right) {
        int res = 0;
        Set<Integer> st = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19));
        for (int i = left; i <= right; i++) {
            if (st.contains(Integer.bitCount(i))) {
                res++;
            }
        }
        return res;
    }
}

/*
public int countPrimeSetBits(int left, int right) {
        HashSet<Integer> s=new HashSet<>();
        s.add(2);
        s.add(3);
        s.add(5);
        s.add(7);
        s.add(11);
        s.add(13);
        s.add(17);
        s.add(19);
        s.add(23);
        s.add(29);
        s.add(31);
        int res=0;
        for(int i=left;i<=right;i++){
            int x=num(i);
            if(s.contains(x))
                res++;
        }
        return res;
    }
    public int num(int x){
        int res=0;
        for(int i=0;i<32;i++){
            if((x&(1<<i))!=0)
                res++;
        }
        return res;
    } 
*/

