import java.util.*;
class Solution {
    int distinctCount(int[] arr, int n) {
        ArrayList<Integer>ls=new ArrayList<Integer>();
        int i;
        for(i=0;i<=n-1;i++){
            ls.add(Math.abs(arr[i]));
        }
        HashSet<Integer>hs=new HashSet<Integer>();
        for(i=0;i<=ls.size()-1;i++){
            hs.add(ls.get(i));
        }
        return hs.size();
    }
}
