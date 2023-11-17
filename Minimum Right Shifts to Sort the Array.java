import java.util.*;
class Solution {
    public static boolean check(int ans[]){
        int i;
        int n=ans.length;
        int flag=0;
        for(i=0;i<n-1;i++){
            if(ans[i]<ans[i+1]){
                flag++;
            }
        }
        if(flag==(n-1)){
            return true;
        }
        return false;
    }
    public int minimumRightShifts(List<Integer> nums) {
        int n=nums.size();
        int i,j;
        int d=n;
        int op=0;
        int last=0;
        int ans[]=new int[nums.size()];
        for(i=0;i<=nums.size()-1;i++){
            ans[i]=nums.get(i);
        }
        if(check(ans)==true){
            return 0;
        }
        int f1=0;
        while(d!=0){
            last=ans[n-1];
            for(i=nums.size()-2;i>=0;i--){
                ans[i+1]=ans[i];
            }
            ans[0]=last;
             op++;
            if(check(ans)==true){
                break;
            }
            else{
                f1++;
            }
            d--;
        }
        if(f1==n){
            return -1;
        }
        return op;
    }
}