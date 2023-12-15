/* Link - https://leetcode.com/problems/destination-city/ */

class Solution {
    public String destCity(List<List<String>> paths) {
        if(paths.size()==1)
        return paths.get(0).get(1);

        HashMap<String, String> hm = new HashMap<>();
        for(List<String> path: paths){
        hm.put(path.get(0),path.get(1));
        }

        String destination = paths.get(0).get(0);
        while(hm.containsKey(destination)){
            destination = hm.get(destination);
        }

        return destination;
    }
}

/* 
Set<String> cities = new HashSet<>(); 
        for (List<String> path : paths) {
            cities.add(path.get(0)); 
        }
        
        for (List<String> path : paths) {
            String dest = path.get(1); 
            if (!cities.contains(dest)) {
                return dest; 
            }
        }
        return "";
*/
