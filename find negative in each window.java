import java.util.*;
class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        int i,j;
        ArrayList<Long>ls=new ArrayList<Long>();
        long flag=0;
        for(i=0;i<=N-K;i++){
            flag=0;
            for(j=i;j<=K-1+i;j++){
                if(A[j]<0){
                    flag++;
                   ls.add(A[j]);
                   break;
                }
            }
            if(flag==0){
                ls.add(flag);
            }
        }
        long ans[]=new long[ls.size()];
        for(i=0;i<=ls.size()-1;i++){
            ans[i]=ls.get(i);
        }
        return ans;
    }
}