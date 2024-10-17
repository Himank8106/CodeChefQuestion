/* Link - https://leetcode.com/problems/maximum-swap/ */

class Solution {
    public int maximumSwap(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        int[] last = new int[10];

        // Store the last occurrence of each digit (0-9)
        for (int i = 0; i < arr.length; i++) {
            last[arr[i] - '0'] = i;
        }

        // Traverse through the number's digits
        for (int i = 0; i < arr.length; i++) {
            // Check for a larger digit in the remaining part
            for (int d = 9; d > arr[i] - '0'; d--) {
                if (last[d] > i) {
                    // Perform the swap
                    char temp = arr[i];
                    arr[i] = arr[last[d]];
                    arr[last[d]] = temp;
                    // Convert the character array back to integer
                    return Integer.parseInt(new String(arr));
                }
            }
        }

        // Return original number if no swap was possible
        return num;
    }
}

/*
String s1 = String.valueOf(num);
        char[] arr = s1.toCharArray();
        char[] sortedArr = s1.toCharArray();
        Arrays.sort(sortedArr);
        StringBuilder sb = new StringBuilder();
        for (char c : sortedArr) sb.append(c);
        sb.reverse();
        String s2 = sb.toString();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                int index = -1;
                for (int j = s1.length() - 1; j >= 0; j--) {
                    if (s1.charAt(j) == s2.charAt(i)) {
                        index = j;
                        break;
                    }
                }
                char temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;
            }
        }
        return Integer.parseInt(new String(arr));
*/

