class Solution
{
    public static long[] printFibb(int n) 
    {
        //Your code here
        long first=1;
        long second=1;
        long ans[]=new long[n];
        if(n==1){
            ans[0]=1;
            return ans;
        }
        ans[0]=1;
        ans[1]=1;
        int i;
        long ans1;
       for(i=2;i<n;i++){
            ans1=first+second;
            ans[i]=ans1;
            first=second;
            second=ans1;
        }
        return ans;
    }
}