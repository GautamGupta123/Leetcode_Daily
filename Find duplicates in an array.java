import java.util.*;
class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        int i;
        int ans[]=new int[n];
        ArrayList<Integer>ls=new ArrayList<Integer>();
        for(i=0;i<=n-1;i++){
            ans[arr[i]]++;
        }
        for(i=0;i<=n-1;i++){
            if(ans[i]>1){
                ls.add(i);
            }
        }
        if(ls.size()==0){
            ls.add(-1);
            return ls;
        }
        return ls;
    }
}