/* Link - https://www.interviewbit.com/problems/maximum-area-of-triangle/ */

public class Solution {
    public int solve(ArrayList<String> A) {        
        char[][]arr=new char[A.size()][A.get(0).length()];
        for(int i=0;i<A.size();i++){
            for(int j=0;j<A.get(0).length();j++){
                arr[i][j]=A.get(i).charAt(j);
            }
        }
        ArrayList<HashMap<Character,Integer>>base=new ArrayList<>();
        for(int i=0;i<arr[0].length;i++){
            base.add(new HashMap<>());
        }
        for(int j=0;j<arr[0].length;j++){
            for(int i=arr.length-1;i>=0;i--){
                if(base.get(j).containsKey(arr[i][j])==false){
                    base.get(j).put(arr[i][j],i);
                }
            }
        }
        HashMap<Character,Integer>left=new HashMap<>();
        HashMap<Character,Integer>right=new HashMap<>();
        for(int j=0;j<arr[0].length;j++){
            for(int i=arr.length-1;i>=0;i--){
                if(left.containsKey(arr[i][j])==false){
                    left.put(arr[i][j],j);
                }
            }
        }
        for(int j=arr[0].length-1;j>=0;j--){
            for(int i=arr.length-1;i>=0;i--){
                if(right.containsKey(arr[i][j])==false){
                    right.put(arr[i][j],j);
                }
            }
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]=='r'){
                    if(base.get(j).containsKey('b')){
                        int baselen=Math.abs(base.get(j).get('b')-i)+1;
                        if(left.containsKey('g')){
                            int height=Math.abs(j-left.get('g'))+1;
                            ans=Math.max(ans,findarea(baselen,height));
                        }
                        if(right.containsKey('g')){
                            int height=Math.abs(j-right.get('g'))+1;
                            ans=Math.max(ans,findarea(baselen,height));
                        }
                    }
                    if(base.get(j).containsKey('g')){
                        int baselen=Math.abs(base.get(j).get('g')-i)+1;
                        if(left.containsKey('b')){
                            int height=Math.abs(j-left.get('b'))+1;
                            ans=Math.max(ans,findarea(baselen,height));;
                        }   
                        if(right.containsKey('b')){
                            int height=Math.abs(j-right.get('b'))+1;
                            ans=Math.max(ans,findarea(baselen,height));
                        }           
                    }
                }else if(arr[i][j]=='b'){
                    if(base.get(j).containsKey('g')){
                        int baselen=Math.abs(base.get(j).get('g')-i)+1;
                        if(left.containsKey('r')){
                            int height=Math.abs(j-left.get('r'))+1;
                            ans=Math.max(ans,findarea(baselen,height));
                        }
                        if(right.containsKey('r')){
                            int height=Math.abs(j-right.get('r'))+1;
                            ans=Math.max(ans,findarea(baselen,height));
                        }
                    }
                    if(base.get(j).containsKey('r')){
                        int baselen=Math.abs(base.get(j).get('r')-i)+1;
                        if(left.containsKey('g')){
                            int height=Math.abs(j-left.get('g'))+1;
                            ans=Math.max(ans,findarea(baselen,height));
                        }
                        if(right.containsKey('g')){
                            int height=Math.abs(j-right.get('g'))+1;
                            ans=Math.max(ans,findarea(baselen,height));
                        }
                    }
                }else if(arr[i][j]=='g'){
                    if(base.get(j).containsKey('b')){
                        int baselen=Math.abs(i-base.get(j).get('b'))+1;
                        if(left.containsKey('r')){
                            int height=Math.abs(j-left.get('r'))+1;
                            ans=Math.max(ans,findarea(baselen,height));
                        }
                        if(right.containsKey('r')){
                            int height=Math.abs(j-right.get('r'))+1;
                            ans=Math.max(ans,findarea(baselen,height));
                        }
                    }
                    if(base.get(j).containsKey('r')){
                        int baselen=Math.abs(i-base.get(j).get('r'))+1;
                        if(left.containsKey('b')){
                            int height=Math.abs(j-left.get('b'))+1;
                            ans=Math.max(ans,findarea(baselen,height));
                        }
                        if(right.containsKey('b')){
                            int height=Math.abs(j-right.get('b'))+1;
                            ans=Math.max(ans,findarea(baselen,height));
                        }
                    }
                }
            }
        }
        return ans;

    }
    public int findarea(int baselen,int height){
        int area=baselen*height;
        if(area%2==0){
            return area=area/2;
        }else{
            return area=(area/2)+1;
        }
    }
}
