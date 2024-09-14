/* Link - https://www.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1 */

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= 0) {
                positive.add(arr.get(i)); 
            } else {
                negative.add(arr.get(i)); 
            }
        }
        int j = 0;
        int k = 0; 
        int i = 0; 
        while (j < positive.size() && k < negative.size()) {
            if (i % 2 == 0) {
                arr.set(i, positive.get(j));
                j++;
            } else {
                arr.set(i, negative.get(k));
                k++;
            }
            i++;
        }
        while (j < positive.size()) {
            arr.set(i, positive.get(j));
            i++;
            j++;
        }
        while (k < negative.size()) {
            arr.set(i, negative.get(k));
            i++;
            k++;
        }
    }
}
