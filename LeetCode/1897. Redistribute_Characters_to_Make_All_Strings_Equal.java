/* Link - https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/ */

class Solution {
    public boolean makeEqual(String[] words) {
        int[] chars = new int[26];
        int n = words.length;
        for(int i = 0; i < n; i++)
        {
            for(int c = 0; c < words[i].length(); c++)
            {
                chars[words[i].charAt(c) - 'a']++;
            }
        }
        for(int i = 0; i < 26; i++)
        {
            if(chars[i] % n != 0)
            {
                return false;
            }
        }
        return true;
    }
}

 
/* 
if (words.length == 1) {
			return true;
		}
		int totalCharCount = 0;
		for (String s : words) {
			totalCharCount += s.length();
		}
		if (totalCharCount % words.length != 0) {
			return false;
		}

		int[] myMap = new int[26];
		for (String s : words) {
			for (char c : s.toCharArray()) {
				myMap[c - 'a']++;
			}
		}
		for (int i : myMap) {
			if (i % words.length != 0) {
				return false;
			}
		}
		return true;
*/
