class Solution {
    int findKRotation(int arr[], int n) {
        int c=0;
        int i;
        int flag=0;
        for(i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
                flag++;
            }
        }
        if(flag==(n-1)){
            return 0;
        }
        if(arr[0]>arr[1]){
            return 1;
        }
        else{
            for(i=0;i<n-1;i++)
            {
                if(arr[i]<arr[i+1]){
                    c++;
                }
                if(i!=0 && arr[i]>arr[i+1] && arr[i]>arr[i-1]){
                    c++;
                    break;
                }
            }
        }
        return c;
    }
}