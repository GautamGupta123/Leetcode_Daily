class Solution {
    int getOddOccurrence(int[] arr, int n) {
        int max=-1;
        int ans1=0;
        int i;
        for(i=0;i<=n-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
         int ans[]=new int[max+1];
         for(i=0;i<=n-1;i++){
             ans[arr[i]]++;
         }
         for(i=0;i<=ans.length-1;i++){
             if(ans[i]%2!=0){
                 ans1=i;
                 break;
             }
         }
         return ans1;
    }
}
