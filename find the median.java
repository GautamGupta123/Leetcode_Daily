import java.util.*;
class Solution
{
    public int find_median(int[] v)
    {
       Arrays.sort(v);
       int i;
       if(v.length%2!=0){
           return (int)Math.floor(v[v.length/2]);
       }
       return (int)Math.floor((v[v.length/2]+v[(v.length/2)-1])/2);
    }
}