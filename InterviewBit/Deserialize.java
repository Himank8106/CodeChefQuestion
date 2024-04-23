/* Link - https://www.interviewbit.com/problems/deserialize/ */

public class Solution {
    public ArrayList<String> deserialize(String A) {
        String[] arr = A.split("[0-9]+~");
        ArrayList<String> res = new ArrayList<>();
        Collections.addAll(res, arr);
        return res;
    }
}
