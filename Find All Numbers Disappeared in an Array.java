import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int i;
        int n=nums.length;
         ArrayList<Integer>hs1=new ArrayList<Integer>();
        for(i=0;i<=n-1;i++){
            hs.add(nums[i]);
        }
        for(i=0;i<=n-1;i++){
            if(!hs.contains(i+1)){
                hs1.add(i+1);
            }
        }
         return hs1;       
    }
}