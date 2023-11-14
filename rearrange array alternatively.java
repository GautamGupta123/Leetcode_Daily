class Solution{
    public static void rearrange(long arr[], int n){
        
        long ans[]=new long[n];
        int i;
        int p=n;
        for(i=0;i<=n-1;i++)
        {
            ans[i]=arr[i];
        }
         i=0;
        int j=n-1;
        int l=0;
        if(n%2==0){
        while(i<j && l<n-1){
            arr[l]=ans[j];
            arr[l+1]=ans[i];
            i++;
            j--;
            l=l+2;
          }
        }
        else{
            while(i<j){
            arr[l]=ans[j];
            arr[l+1]=ans[i];
            i++;
            j--;
            l=l+2;
        }
        arr[n-1]=ans[p/2];
        }
    }
    
}