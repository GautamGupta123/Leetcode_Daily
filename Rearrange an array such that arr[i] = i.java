class Solution{
    public static int[] modifyArray (int arr[], int n) {
        int ans[]=new int[n];
        int i;
        int c=0;
        for(i=0;i<=n-1;i++){
            if(arr[i]==0){
                c++;
            }
            if(arr[i]!=-1){
                ans[arr[i]]=arr[i];
            }
        }
        for(i=1;i<=ans.length-1;i++){
             if(ans[i]==0){
                ans[i]=-1;
            }
        }
        if(c!=0){
            ans[0]=0;
        }
        else{
            ans[0]=-1;
        }
        return ans;
    }
}