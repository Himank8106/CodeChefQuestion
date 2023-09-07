/* Link - https://leetcode.com/problems/sort-the-people/ */

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int temp=0;
        String temp2="";
        int l=names.length-1;
        String ar[]=new String[names.length];
        for(int i=0;i<names.length-1;i++){
            for(int j=0;j<names.length-1-i;j++)
            {
                if(heights[j]<heights[j+1])
                {
                    temp=heights[j];
                    heights[j]=heights[j+1];
                    heights[j+1]=temp;

                    temp2=names[j];
                    names[j]=names[j+1];
                    names[j+1]=temp2;

                }
            }
        }

        System.gc();
        return names;
    }
}


/* 
int[][] people =  new int[names.length][2];
        for(int i=0; i<names.length; i++){
            people[i] = new int[] {heights[i],i};
        }
        Arrays.sort(people, (a,b) -> b[0]-a[0]);
        String[] res = new String[names.length];
        for(int i=0; i<names.length; i++){
            res[i]  = names[people[i][1]];
        }
        return res;
*/
