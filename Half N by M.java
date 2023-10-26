import java.util.*;
class Solution{
    static int mthHalf(int N, int M){
        // code here
        ArrayList<Integer>ls=new ArrayList<Integer>();
        int t=M-1;
        ls.add(N);
        while(t!=0){
            N=N/2;
            ls.add(N);
            t--;
        }
        int i;
        int ans=0;
        for(i=0;i<=ls.size()-1;i++){
            if((i+1)==M){
                ans=ls.get(i);
                break;
            }
        }
        return ans;
    }
}