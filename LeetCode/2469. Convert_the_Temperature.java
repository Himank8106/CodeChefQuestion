/* Link - https://leetcode.com/problems/convert-the-temperature/ */

class Solution {
    public double[] convertTemperature(double celsius) {
        double[] arr = new double[2];

        double kel = celsius + 273.15;
        double farh = celsius * 1.80 + 32.00;

        arr[0] = kel;
        arr[1] = farh;

        return arr;
    }
}
