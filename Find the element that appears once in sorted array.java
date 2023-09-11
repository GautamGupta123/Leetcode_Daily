class Solution 
{
    int findOnce(int arr[], int n)
    {
        // Complete this function
        int i;
        int ele=-1;
        if(n==1){
            return arr[0];
        }
        for(i=0;i<=n-1;i++){
            if(i==0){
                if(arr[0]!=arr[1]){
                    ele=arr[0];
                    break;
                }
            }
            else if(i==(n-1)){
                if(arr[n-1]!=arr[n-2]){
                    ele=arr[n-1];
                    break;
                }
            }
            else{
            if(arr[i]!=arr[i+1] && arr[i]!=arr[i-1]){
                ele=arr[i];
            }
          }
        }
        
        return ele;
    }
}