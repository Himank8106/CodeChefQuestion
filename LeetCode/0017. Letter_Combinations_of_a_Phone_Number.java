/* Link - https://leetcode.com/problems/letter-combinations-of-a-phone-number/ */

class Solution {
    Map<Character, String> map;

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits == null || digits.length() <= 0) return ans;

        map = new HashMap<>();
        map.put('2', "abc"); map.put('3', "def");
        map.put('4', "ghi"); map.put('5', "jkl");
        map.put('6', "mno"); map.put('7', "pqrs");
        map.put('8', "tuv"); map.put('9', "wxyz");

        letterCombinationsHelper(0, digits, new StringBuilder(), ans);
        return ans;
    }

    private void letterCombinationsHelper(int idx, String digits, StringBuilder sb, List<String> ans){
        if(idx == digits.length()){
            ans.add(sb.toString());
            return;
        }

        String s = map.get(digits.charAt(idx));

        for(char c : s.toCharArray()){
            sb.append(c);
            letterCombinationsHelper(idx+1, digits, sb, ans);
            sb.deleteCharAt(sb.length()-1);
        }
    
    }
}
