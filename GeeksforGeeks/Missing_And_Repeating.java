/* Link - https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1 */

class Solve {
    int[] findTwoElement(int arr[]) {
       
        int[] result = new int[2]; 
        Map<Integer, Integer> count = new HashMap<>();

        
        for (int i : arr) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }

       
        for (int i = 1; i <= arr.length; i++) {
            if (!count.containsKey(i)) {
                result[1] = i;  
            } else if (count.get(i) == 2) {
                result[0] = i; 
            }
        }
        
    return result;
    }
}
