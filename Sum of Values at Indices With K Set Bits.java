import java.util.*;
class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int i,j;
        int n=nums.size();
        Integer arr[]=new Integer[n];
        arr=nums.toArray(arr);
        int c=0;
        int sum=0;
        int rem;
        String s="";
        for(i=0;i<=n-1;i++){
            int temp=arr[i];
            c=0;
            int t=i;
            s="";
            while(t>0){
                rem=t%2;
                s=s+rem;
                t=t/2;
            }
            for(j=0;j<=s.length()-1;j++){
                if(s.charAt(j)=='1'){
                    c++;
                }
            }
            if(c==k){
                sum=sum+temp;
            }
        }
        return sum;
    }
}