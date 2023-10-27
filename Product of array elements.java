class GfG
{
    public static Long product(Long arr[], Long mod, int n)
    {
       long p=1;
       int i;
       for(i=0;i<=n-1;i++){
           p=(p*arr[i])%mod;
       }
       long ans=p%mod;
       return ans;
    }
}