/* Link - https://leetcode.com/problems/count-common-words-with-one-occurrence/ */

class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        int finalCount = 0;

        for(String i : words1){
             if(map.containsKey(i)){
                 int x = map.get(i);
                 map.put(i,x+1);
             }
             else{
                 map.put(i,1);
             }
        }
        for(String i: words2){
            if(map.containsKey(i)){
                int x = map.get(i);
                if(x == 1){
                    finalCount++;
                    map.put(i,0);
                }
                else if(x == 0){
                    finalCount--;
                    map.put(i,-1);
                }
                // else if(x>1){
                //     map.put(i,x+1);
                // }
                }
            }
       return finalCount;
    }
}

/* 
HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
		
        for(String word : words1)
            map1.put(word,map1.getOrDefault(word,0)+1);
        for(String word : words2)
            map2.put(word,map2.getOrDefault(word,0)+1);
			
        int count = 0;
        for(String word : words1)
            if(map1.get(word) == 1 && map2.getOrDefault(word,0) == 1)
                count++;
        return count;
*/
