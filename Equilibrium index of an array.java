class GfG
{
    public static int findEquilibrium(int arr[], int n)
      {
         int i,j;
         int sum=0;
         int sum1=0;
         int k;
         int ans=-1;
         for(i=1;i<n-1;i++){
             sum=0;
             sum1=0;
             for(j=0;j<i;j++){
                 sum+=arr[j];
             }
             for(k=i+1;k<=n-1;k++){
                 sum1+=arr[k];
             }
             if(sum==sum1){
                 ans=i;
                 break;
             }
         }
         return ans;
      }
}