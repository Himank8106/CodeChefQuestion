/* Link - https://leetcode.com/problems/watering-plants/ */

class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int currentAmt = capacity, steps=0;
        for(int i=0; i<plants.length; i++) {
            if(currentAmt < plants[i]) {
                steps += (i + i + 1);
                currentAmt = capacity - plants[i];
            } else {
                currentAmt -= plants[i];
                steps++;
            }
        }
        return steps;
    }
}

 

/* 
int initial = capacity, count = 0;
        for(int i=0; i<plants.length; i++){
            if(plants[i]<=capacity){
                capacity -= plants[i];
                count++;
            }
            else{
                count += 2*i+1;
                capacity = initial;
                capacity -= plants[i];
            }
        }
        return count;
*/
