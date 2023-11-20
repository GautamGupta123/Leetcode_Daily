class Solution
{
    static void arrange(long arr[], int n)
    {
        long ans[]=new long[n];
        int i;
        for(i=0;i<=n-1;i++){
            ans[i]=arr[i];
        }
        for(i=0;i<=n-1;i++){
            arr[i]=ans[(int)ans[i]];
        }
    }
}