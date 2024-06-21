/* Link - https://www.interviewbit.com/problems/largest-rectangle-in-histogram/ */

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public int largestRectangleArea(ArrayList<Integer> height) {
        int n = height.size();
        Stack<Integer> s = new Stack<>();
        int value = 0;
        s.push(0);
        
        for (int i = 1; i < n; i++) {
            if (s.isEmpty() || height.get(i) >= height.get(s.peek())) {
                s.push(i);
            } else {
                while (!s.isEmpty() && height.get(s.peek()) > height.get(i)) {
                    int val = height.get(s.pop());
                    int area;
                    if (s.isEmpty()) {
                        area = val * i;
                    } else {
                        area = val * (i - s.peek() - 1);
                    }
                    value = Math.max(value, area);
                }
                s.push(i);
            }
        }

        while (!s.isEmpty()) {
            int val = height.get(s.pop());
            int area;
            if (s.isEmpty()) {
                area = val * n;
            } else {
                area = val * (n - s.peek() - 1);
            }
            value = Math.max(value, area);
        }

        return value;
    }
}
