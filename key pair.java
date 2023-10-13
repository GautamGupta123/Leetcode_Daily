import java.util.*;
class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        int i=0;
        int sum=0;
        int j=n-1;
        Arrays.sort(arr);
        while(i<j){
            sum=arr[i]+arr[j];
            if(sum==x){
                return true;
            }
            if(sum>x){
                j--;
                
            }
            else{
                i++;
            }
        }
        return false;
    }
}