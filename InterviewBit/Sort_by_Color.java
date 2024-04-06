/* Link - https://www.interviewbit.com/problems/sort-by-color/ */

public class Solution {
 public void sortColors(ArrayList<Integer> a) {
    int idx0 = 0;
    int idx2 = a.size() - 1;
    int loop = 0;
    while(loop <= idx2) {
       
        if(a.get(loop) == 0) {
            swap(loop, idx0, a);
            idx0 ++;
        }

        if (a.get(loop) == 2) {
            swap(loop, idx2, a);
            idx2 --;
        }

        while(idx0 < a.size() && a.get(idx0) == 0 ) idx0 ++;
        while(idx2 >= 0 &&  a.get(idx2) == 2) idx2 --;
        if(loop <= idx0) loop = idx0;
        if(loop < a.size() && a.get(loop) == 1) loop += 1;
    }

}

private void swap(int i, int j, ArrayList<Integer> a) {
    int temp = a.get(j);
    a.set(j, a.get(i));
    a.set(i, temp);
}

}
