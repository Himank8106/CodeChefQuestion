/* Link - https://www.geeksforgeeks.org/problems/reach-a-given-score-1587115621/ */

class Geeks {
    public long count(int n) {
        // Add your code here.
        long count=0,  remaining=0;
        for(int i=0; i<=n/3; i++){
            remaining = n-i*3;
            if(remaining%5 != 0) continue;
            count += remaining/10 + 1;
        }
        return count;
    }
}
