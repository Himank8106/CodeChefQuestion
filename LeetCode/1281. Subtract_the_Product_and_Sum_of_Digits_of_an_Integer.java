class Solution {
    public ArrayList<Integer> list = new ArrayList<>();
    public int subtractProductAndSum(int n) {
        int add = 0;
        int sum = 1;
        digit(n, list);
        for(int i = 0; i < list.size(); i++){
            add = list.get(i) + add;
            sum = list.get(i) * sum;
        }
        return sum - add;
    }
    public ArrayList<Integer> digit(int m, ArrayList<Integer> list){
        int q = m/10;
        int r = m % 10;
        list.add(r);
        if(q < 1){
            return list;
        }
       return digit(q, list);
    }
}

/*
int sum=0, product=1;
while(n!=0){
    sum += n%10;
    product *= n%10;
    n /= 10;
}
int result=product-sum;
return result;
*/
