import java.util.*;
class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        int i;
        int cnt=0;
        int c=0;
        int ele=-1;
        Arrays.sort(arr);
        int j;
        for(i=0;i<=n-1;i++){
            //c=0;
            if(ele==arr[i]){
                c=0;
                i++;
            }
            else{
                c=0;
                ele=arr[i];
           for(j=0;j<=n-1;j++){
               if(ele==arr[j]){
                   c++;
               }
           }
          }
          if(c>(n/k)){
              cnt++;
          }
        }
        return cnt;
    }
}