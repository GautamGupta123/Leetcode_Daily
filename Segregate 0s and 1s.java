import java.util.*;
class Solution {
    void segregate0and1(int[] arr, int n) {
        ArrayList<Integer>ls=new ArrayList<Integer>();
        int i;
        for(i=0;i<=n-1;i++){
            if(arr[i]==0){
               ls.add(arr[i]);
            }
        }
        for(i=0;i<=n-1;i++){
            if(arr[i]==1){
                ls.add(arr[i]);
            }
        }
        for(i=0;i<=ls.size()-1;i++){
            arr[i]=ls.get(i);
        }
    }

}