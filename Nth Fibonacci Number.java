import java.util.*;
class Solution {
    static int nthFibonacci(int n){
        // code here
        if(n==1 || n==2){
            return 1;
        }
        long first=1;
        long second=1;
        
        ArrayList<Long>ls=new ArrayList<Long>();
        int i;
        int start=0;
        long ans=0;
        ls.add(first);
        ls.add(second);
        while(start<=n){
            ans=(long)first%(long)(1e9+7)+(long)second%(long)(1e9+7);
            ls.add(ans);
            first=(long)second;
            second=(long)ans;
            start++;
        }
        long ans1=0;
        for(i=0;i<=ls.size()-1;i++){
            if((i+1)==n){
                ans1=(long)ls.get(i);
                break;
            }
        }
        long ans2=(long)ans1%(long)(1e9+7);
        return (int)ans2;
    }
}