import java.util.*;
class Solution
{
    boolean checkIsAP(int arr[] ,int n)
    {
        Arrays.sort(arr);
        int i;
        int d=0;
        HashSet<Integer>ls=new HashSet<Integer>();
        for(i=0;i<n-1;i++){
            d=arr[i+1]-arr[i];
            ls.add(d);
        }
        if(ls.size()==1){
            return true;
        }
        return false;
    }
}