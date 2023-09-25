class Solution {
    int print2largest(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        int i;
        int ele=-1;
        for(i=n-1;i>0;i--){
           if(arr[i]!=arr[i-1]){
                ele=arr[i-1];
                break;
            }
        }
        return ele;
    }
}