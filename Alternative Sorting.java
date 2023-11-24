import java.util.*;
class Solution
{
    ArrayList<Long> alternateSort(long arr[] ,int N)
    {
       ArrayList<Long>ls=new ArrayList<Long>();
       int i=0;
       int j=N-1;
       Arrays.sort(arr);
       while(i<=j){
           ls.add(arr[j]);
           ls.add(arr[i]);
           i++;
           j--;
       }
        return ls;
    }
}