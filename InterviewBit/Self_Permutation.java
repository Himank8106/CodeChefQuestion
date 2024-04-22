/* Link - https://www.interviewbit.com/problems/self-permutation/ */

public class Solution {
  public int permuteStrings(String a, String b) {
    HashMap<Character, Integer>freq = new HashMap<>();
    for(Character ch : a.toCharArray()) {
      freq.put(ch, freq.getOrDefault(ch,0)+1);
    }
    for(Character ch : b.toCharArray()) {
      if(!freq.containsKey(ch)) {
      return 0;
    }
      else {
      freq.put(ch,freq.get(ch)-1);
      if(freq.get(ch) == 0) freq.remove(ch);
      }
    }
    return (freq.size() == 0)?1:0;
  }
}
