/* Link - https://leetcode.com/problems/kth-distinct-string-in-an-array/ */

class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashSet<String> hs1 = new LinkedHashSet<>();
        LinkedHashSet<String> hs2 = new LinkedHashSet<>();
        for(int i=0; i<arr.length; i++){
            if(hs1.contains(arr[i])) hs2.add(arr[i]);
            else hs1.add(arr[i]);
        }
        hs1.removeAll(hs2);
        if(k<=hs1.size()){
            Iterator<String> it = hs1.iterator();
            int x = 0;
            while(it.hasNext()){
                if(x==k-1) return it.next();
                it.next();
                x += 1;
            }
        }
        return "";
    }
}
