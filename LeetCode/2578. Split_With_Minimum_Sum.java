/* Link - https://leetcode.com/problems/split-with-minimum-sum/ */

class Solution {
    public int splitNum(int num) {
        char[] c = String.valueOf(num).toCharArray();
        Arrays.sort(c);
        int a = 0, b = 0;
        for(int i=0,j=1; i<c.length || j <c.length ; i+=2,j+=2) {
            if(i<c.length) {
                a = (a*10) + (c[i]-'0');
            }
            if(j<c.length) {
                b = (b*10) + (c[j]-'0');
            }
        }
        return a + b;
    }
}

/* 
StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        char[] chars = String.valueOf(num).toCharArray();
        Arrays.sort(chars);
        for(int i=0; i<chars.length; ++i){
            if(i%2==0) sb1.append(chars[i]);
            else sb2.append(chars[i]);
        }
        return Integer.parseInt(sb1.toString())+Integer.parseInt(sb2.toString());
*/
/*
if (num < 10) {
            return num;
        }
        if (num < 100) {
            return (num / 10 + num % 10);
        }
        
        int[] counts = new int[10];
        int n = num;
        while (n > 0) {
            counts[n % 10]++;
            n /= 10;
        }

        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();

        for (int i = 0; i < 10; i ++) {
            if (counts[i] > 0) {
                int half = counts[i] / 2;
                for (int j = 0; j < half; j++) {
                    num1.append(i);
                    num2.append(i);
                }
                if (counts[i] % 2 == 1) {
                    if (num1.length() <  num2.length()) {
                        num1.append(i);
                    } else {
                        num2.append(i);
                    }
                }
            }
        }

        return (Integer.parseInt(num1.toString()) + Integer.parseInt(num2.toString()));
*/
