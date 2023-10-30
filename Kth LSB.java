import java.util.*;
class Solution {
    long KthLSB(long n,int k) {
        ArrayList<Long>ls=new ArrayList<Long>();
        int i;
        long temp=n;
        while(temp>=1){
            ls.add(temp%2);
            temp=temp/2;
        }
        if(k>ls.size()){
            return 0;
        }
        for(i=0;i<=ls.size()-1;i++){
            if(i==(k-1)){
            return ls.get(i);
            }
        }
        return ls.get(k-1);
    }
}