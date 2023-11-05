import java.util.*;
class Solution{
    static ArrayList<Integer> leaders(int arr[], int n){
        int i;
        int c=0;
        int flag=0;
        int t=0;
        int j;
        ArrayList<Integer>ls=new ArrayList<Integer>();
        for(i=0;i<n-1;i++){
            c=0;
            flag=0;
            t=0;
            for(j=n-1;j>i;j--)
            {
                c++;
                if(arr[j]<=arr[i]){
                    flag++;
                }
                else{
                    t++;
                    break;
                }
            }
          if(t==0){
            if(flag==c){
                ls.add(arr[i]);
             }
           }
        }
        ls.add(arr[n-1]);
        return ls;
    }
}