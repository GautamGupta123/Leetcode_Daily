import java.util.*;
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i;
        HashSet<Integer>hs=new HashSet<Integer>();
        for(i=0;i<=arr.length-1;i++){
            hs.add(arr[i]);
        }
        HashSet<Integer>hs1=new HashSet<Integer>();
        for(i=1;i<=(int)Math.pow(10,4);i++){
            if(!hs.contains(i)){
                hs1.add(i);
            }
        }
        ArrayList<Integer>ls=new ArrayList<Integer>(hs1);
        int ans=0;   
        for(i=0;i<=hs1.size()-1;i++){
            if(i==(k-1)){
                ans=ls.get(i);
                break;
            }
        }
        return ans;
    }
}