/* Link - https://www.geeksforgeeks.org/problems/sorting-elements-of-an-array-by-frequency-1587115621/1 */

class Solution {
    public ArrayList<Integer> sortByFreq(int arr[]) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            result.add(num);
        }
        result.sort((a,b) -> {
           int freqA = frequencyMap.get(a), freqB = frequencyMap.get(b);
           if(freqA!=freqB) return freqB-freqA;
           else return a-b;
        });

        return result;
    }
}
