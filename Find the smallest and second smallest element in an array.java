import java.util.*;
class Compute 
{
    public long[] minAnd2ndMin(long a[], long n)  
    {
        long ans[]=new long[2];
        int i;
        int flag=0;
        for(i=0;i<n-1;i++){
            if(a[i]==a[i+1]){
                flag++;
            }
        }
        if(flag==(n-1)){
           ans[0]=-1;
           return ans;
        }
        Arrays.sort(a);
        ans[0]=a[0];
        for(i=1;i<=n-1;i++){
            if(a[i]!=a[i-1]){
                ans[1]=a[i];
                break;
            }
        }
        return ans;
    }
}
