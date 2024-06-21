/* Link - https://www.geeksforgeeks.org/problems/compare-two-fractions4438/1 */

class Solution {

    String compareFrac(String str) {
        // Code here
        str = str.trim();
        String[] arr = str.split(",");
        String[] arr1 = arr[0].trim().split("/");
        String[] arr2 = arr[1].trim().split("/");
        double firNum = Double.parseDouble(arr1[0].trim());
        double firDen = Double.parseDouble(arr1[1].trim());
        double secNum = Double.parseDouble(arr2[0].trim());
        double secDen = Double.parseDouble(arr2[1].trim());
        double firstVal = firNum/firDen, secondVal = secNum/secDen;
        if(firstVal>secondVal) return arr1[0]+"/"+arr1[1];
        else if(secondVal > firstVal) return arr2[0]+"/"+arr2[1];
        else return "equal";
    }
}
