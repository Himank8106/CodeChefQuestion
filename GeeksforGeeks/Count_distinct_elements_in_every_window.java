/* Link - https://www.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1 */

class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < k; i++) {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }
        result.add(freqMap.size());
        for (int i = k; i < arr.length; i++) {
            int outgoingElement = arr[i - k];
            freqMap.put(outgoingElement, freqMap.get(outgoingElement) - 1);
            if (freqMap.get(outgoingElement) == 0) {
                freqMap.remove(outgoingElement);
            }
            int incomingElement = arr[i];
            freqMap.put(incomingElement, freqMap.getOrDefault(incomingElement, 0) + 1);
            result.add(freqMap.size());
        }
        
        return result;
    }
}
