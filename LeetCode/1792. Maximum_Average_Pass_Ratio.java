/* Link - vhttps://leetcode.com/problems/maximum-average-pass-ratio/ */

class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        double sum = 0;
        PriorityQueue<ClassRec> pq = new PriorityQueue<>(new Compare());
        for(int[] cl:classes){
            pq.add(new ClassRec(cl));
        }
        ClassRec cl;
        while(extraStudents-->0){
            pq.add(pq.remove().addOneStudent());
        }
        while(!pq.isEmpty()){
            cl = pq.remove();
            sum += (double)cl.pass/cl.total;
        }
        return sum/classes.length;
    }
}

class ClassRec{
    int pass, total;
    double inc;
    public ClassRec(int[] arr){
        pass = arr[0];
        total = arr[1];
        inc = getIncrement();
    }
    public ClassRec addOneStudent(){
        pass++;
        total++;
        inc = getIncrement();
        return this;
    }

    private double getIncrement(){
        return (pass+1.0)/(total+1)-(double)pass/total;
    }
}

class Compare implements Comparator<ClassRec>{
    public int compare(ClassRec a, ClassRec b){
        if(a.inc<b.inc) return 1;
        else if(a.inc>b.inc) return -1;
        else return 0;
    }
}
