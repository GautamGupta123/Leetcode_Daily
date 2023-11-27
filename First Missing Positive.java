import java.util.*;
class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer>hs=new HashSet<Integer>();
        int i;
        int ans=0;
        for(i=0;i<=nums.length-1;i++){
            hs.add(nums[i]);
        }
        for(i=1;i<=(int)Math.pow(10,5)+1;i++){
            if(!hs.contains(i)){
                ans=i;
                break;
            }
        }
        return ans;
    }
}