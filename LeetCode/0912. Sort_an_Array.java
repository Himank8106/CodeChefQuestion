/* Link - https://leetcode.com/problems/sort-an-array/ */

class Solution {
    public int[] sortArray(int[] nums) {
        int[] counting = new int[2 * 50000 + 1];
        for (int num : nums) {
            // we add 5 * 10^4 because for smallest possible element -5 * 10^4 index must be 0
            counting[num + 50000]++;
        }
        int writeInd = 0;
        for (int numberInd = 0; numberInd < counting.length; numberInd++) {
            int freq = counting[numberInd];
            while (freq != 0) {
                nums[writeInd] = numberInd - 50000;
                writeInd++;
                freq--;
            }
        }
        return nums;
    }
}

/*
class Solution {
    public int[] sortArray(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        int n = max - min;
        int[] arr = new int[n + 1];

        for (int num : nums) {
            arr[num - min]++;
        }

        int index = 0;

        for (int i = 0; i <= n; i++) {
            while (arr[i] > 0) {
                nums[index] = min;
                index++;
                arr[i]--;
            }

            min++;
        }

        return nums;
    }
}
*/ 
