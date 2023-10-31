import java.util.*;
class Solution{
    public static void frequencyCount(int arr[], int N, int P)
    {
        int ans[]=new int[N+1];
        int i;
            for(i=0;i<=N-1;i++){
              if(arr[i]>N){
                  arr[i]=0;
              }
            }
        for(i=0;i<=N-1;i++){
            ans[arr[i]]++;
        }
        ArrayList<Integer>ls=new ArrayList<Integer>();
        for(i=1;i<=N;i++){
            ls.add(ans[i]);
        }
        for(i=0;i<=N-1;i++){
            arr[i]=ls.get(i);
        }
    }
}
