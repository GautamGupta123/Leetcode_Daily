import java.util.*;
class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        ArrayList<Integer>ls=new ArrayList<Integer>();
        int i;
        for(i=0;i<=arr.length-1;i++){
            if(arr[i]!=0){
                ls.add(arr[i]);
            }
        }
        for(i=0;i<=n-1;i++){
            if(arr[i]==0){
                ls.add(arr[i]);
            }
        }
        for(i=0;i<=n-1;i++){
            arr[i]=ls.get(i);
        }
    }
}