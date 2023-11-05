import java.util.*;
class Solution {
    int findSum(int arr[], int n) {
        HashSet<Integer>hs=new HashSet<Integer>();
        int i;
        for(i=0;i<=n-1;i++){
            hs.add(arr[i]);
        }
        int sum=0;
        ArrayList<Integer>ls=new ArrayList<Integer>(hs);
        for(i=0;i<=ls.size()-1;i++){
                sum+=ls.get(i);
        }
        return sum;
    }
}