import java.util.*;
class Solution{
    public static boolean areElementsContiguous (int arr[], int n) {
        
       ArrayList<Integer>ls=new ArrayList<Integer>();
       int i;
       for(i=0;i<=n-1;i++){
           if(!ls.contains(arr[i])){
               ls.add(arr[i]);
           }
       }
       Collections.sort(ls);
       int flag=0;
       for(i=0;i<ls.size()-1;i++){
           if(ls.get(i+1)==ls.get(i)+1){
               flag++;
           }
       }
       if(flag==(ls.size()-1)){
           return true;
       }
       return false;
    }
}