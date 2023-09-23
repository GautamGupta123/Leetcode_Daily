class Solution {
    void immediateSmaller(int arr[], int n) {
        // code here
        int i;
        for(i=1;i<=n-1;i++){
            if(arr[i-1]>arr[i]){
                arr[i-1]=arr[i];
            }
            else{
                arr[i-1]=-1;
            }
        }
        arr[n-1]=-1;
    }
}