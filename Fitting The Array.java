import java.util.*;
class Solution{
    public static boolean isFit (int arr[], int brr[], int n) {
        Arrays.sort(arr);
        Arrays.sort(brr);
        int i;
        int flag=0;
        for(i=0;i<=n-1;i++){
            if(arr[i]<=brr[i]){
                flag++;
            }
        }
        if(flag==n){
            return true;
        }
        return false;
    }
    
}