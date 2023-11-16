import java.util.*;
class Solution {
    public static ArrayList<Integer> Solve(int n, int[] nums) {
        ArrayList<Integer>ls=new ArrayList<Integer>();
        int i;
        Arrays.sort(nums);
        int c=1;
        int flag=0;
        if(n==1){
            if(c>(n/3)){
                ls.add(nums[0]);
                return ls;
            }
            else{
                ls.add(-1);
                return ls;
            }
        }
        for(i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                c++;
            }
            if(nums[i]!=nums[i+1] || i==(n-2)){
                if(c>(n/3)){
                    flag++;
                    ls.add(nums[i]);
                    c=1;
                }
                else{
                c=1;
                }
            }
        }
        if(nums[n-2]!=nums[n-1] && c>(n/3)){
            ls.add(nums[n-1]);
        }
        if(flag==0){
            ls.add(-1);
        }
        return ls;
    }
}
  