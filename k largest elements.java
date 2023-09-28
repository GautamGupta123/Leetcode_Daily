import java.util.*;
class Solution
{
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        ArrayList<Integer>ls=new ArrayList<Integer>();
        int i;
        Arrays.sort(arr);
        for(i=n-1;i>=0;i--){
            if(k==0){
                break;
            }
            ls.add(arr[i]);
            k--;
        }
        return ls;
    }
}