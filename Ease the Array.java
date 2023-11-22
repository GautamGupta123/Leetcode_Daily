import java.util.*;
class Solution{
    void modifyAndRearrangeArr (int arr[], int n) {
        ArrayList<Integer>ls=new ArrayList<Integer>();
        int i;
        for(i=0;i<n-1;i++){
            if(arr[i]==arr[i+1] && arr[i]!=0 && arr[i+1]!=0){
                arr[i]=arr[i]*2;
                arr[i+1]=0;
            }
        }
        for(i=0;i<=n-1;i++){
            ls.add(arr[i]);
        }
        int j=0;
        for(i=0;i<=n-1;i++){
            if(ls.get(i)!=0){
                arr[j]=ls.get(i);
                j++;
            }
        }
        int ind=j;
        for(i=0;i<=n-1;i++){
            if(ls.get(i)==0){
                arr[ind]=ls.get(i);
                ind++;
            }
        }
        
    }
}
