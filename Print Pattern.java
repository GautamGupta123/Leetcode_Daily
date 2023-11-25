import java.util.*;
class Solution{
    public List<Integer> pattern(int N){
        ArrayList<Integer>ls=new ArrayList<Integer>();
        int ans=N;
        while(N>0){
            ls.add(N);
            N=N-5;
        }
       while(N<=ans){
           ls.add(N);
           N=N+5;
       }
        return ls;
    }
}