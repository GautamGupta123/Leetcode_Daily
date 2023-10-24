import java.util.*;
class Solution { 
    public static long sumBetweenTwoKth(long A[], long N, long K1, long K2)
    {
        Arrays.sort(A);
        long i;
        long one=1;
        long second=1;
        long ans=0;
        long ans1=0;
        for(i=0;i<=A.length-1;i++){
            if(one==K1){
                ans=i;
            }
            if(second==K2){
                ans1=i;
            }
            one++;
            second++;
        }
        int sum=0;
        for(i=ans+1;i<ans1;i++){
            sum=sum+(int)A[(int)i];
        }
        return sum;
    }
}
