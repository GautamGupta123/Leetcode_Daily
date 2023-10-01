class Solution {
    
    public long firstIndex(long arr[], long n)
    {
        long ind=-1;
        int i;
        for(i=0;i<=n-1;i++){
            if(arr[i]==1){
                ind=(long)i;
                break;
            }
        }
        return ind;
    }
}