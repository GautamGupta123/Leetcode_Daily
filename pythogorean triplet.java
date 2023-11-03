import java.util.*;
class Solution {
    boolean checkTriplet(int[] arr, int n) {
        ArrayList<Integer>ls=new ArrayList<Integer>();
        int i,j;
        ArrayList<Integer>sqlist=new ArrayList<Integer>();
        for(i=0;i<=n-1;i++){
            if(!ls.contains(arr[i])){
                ls.add(arr[i]);
                sqlist.add(arr[i]*arr[i]);
            }
        }
        int ans[]=new int[ls.size()];
        for(i=0;i<=ls.size()-1;i++){
            ans[i]=sqlist.get(i);
        }
        for(i=0;i<=ans.length-1;i++){
            for(j=0;j<=ans.length-1;j++){
                if(sqlist.contains(ans[i]+ans[j])){
                    return true;
                }
            }
        }
        return false;
    }
}