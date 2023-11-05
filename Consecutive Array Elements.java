import java.util.*;
class Solution
{
    boolean areConsecutives(long arr[], int N)
    {
         Arrays.sort(arr);
         int i;
         int flag=0;
         for(i=0;i<N-1;i++){
             if(arr[i+1]==arr[i]+1){
                 flag++;
             }
         }
         if(flag==arr.length-1){
             return true;
         }
         return false;
    }
}