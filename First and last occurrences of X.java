import java.util.*;
class Solution{
    public ArrayList<Integer> firstAndLast(int arr[], int n, int x){
        // Code here
        int i;
        int flag=0;
        ArrayList<Integer>ls=new ArrayList<Integer>();
        for(i=0;i<=n-1;i++){
            if(arr[i]!=x){
                flag++;
            }
        }
        if(flag==n){
            ls.add(-1);
            return ls;
        }
        else{
            for(i=0;i<=n-1;i++){
                if(arr[i]==x){
                    ls.add(i);
                    break;
                }
            }
            for(i=n-1;i>=0;i--){
                if(arr[i]==x){
                    ls.add(i);
                    break;
                }
            }
        }
        return ls;
    }
    
}