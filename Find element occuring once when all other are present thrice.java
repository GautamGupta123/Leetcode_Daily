import java.util.*;
class Solution {
    static int singleElement(int[] arr , int N) {
        Arrays.sort(arr);
        int i;
        if(N==1){
            return arr[0];
        }
        int ans=0;
        if(arr[0]!=arr[1]){
            return arr[0];
        }
        for(i=1;i<N-1;i++){
            if(arr[i]!=arr[i+1] && arr[i]!=arr[i-1]){
                ans=arr[i];
                break;
            }
        }
        if(arr[N-1]!=arr[N-2]){
            return arr[N-1];
        }
        return ans;
    }
}