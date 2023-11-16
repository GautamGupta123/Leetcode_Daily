class Solution {
    int getSingle(int arr[], int n) {
        int i;
        int c=1;
        int ans=0;
        int flag=0;
        Arrays.sort(arr);
        for(i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                flag++;
            }
        }
        if(flag==(n-1)){
            return 0;
        }
        for(i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                c++;
            }
            if(arr[i]!=arr[i+1] || i==(n-2)){
                if(c%2!=0){
                    ans=arr[i];
                    break;
                }
                else{
                    c=1;
                }
            }
        }
        if(arr[n-1]!=arr[n-2]){
            ans=arr[n-1];
        }
        return ans;
    }
}