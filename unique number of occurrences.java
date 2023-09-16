import java.util.*;
class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
        int i;
        HashSet<Integer>hs=new HashSet<>();
        for(i=0;i<=n-1;i++){
            hs.add(arr[i]);
        }
        int fl=1;
        for(i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                fl++;
            }
        }
        if(fl==n){
            return true;
        }
        int ans[]=new int[hs.size()];
        Arrays.sort(arr);
        int cnt=1;
        int j;
        j=0;
        for(i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                cnt++;
                if(i==n-2){
                    ans[j]=cnt;
                    break;
                }
            }
            else if(arr[i]!=arr[i+1]){
                // if(j!=hs.size()-1){
                ans[j]=cnt;
                j++;
                // }
                cnt=1;
            }
        }
        int flag=0;
        // for(i=0;i<=ans.length-1;i++){
        //     System.out.print(ans[i]);
        // }
        Arrays.sort(ans);
        for(i=0;i<ans.length-1;i++){
            if(ans[i]!=ans[i+1]){
                flag++;
            }
            else{
                flag=0;
                break;
            }
        }
        if(flag==0){
            return false;
        }
        return true;
    }
}