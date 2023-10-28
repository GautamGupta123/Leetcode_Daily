import java.util.*;
class Solution {
    public int sumCounts(List<Integer> nums) {
        int i,j;
        HashSet<Integer>hs=new HashSet<Integer>();
        int square=0;
         if(nums.size()==1){
             return 1;
         }
        for(i=0;i<nums.size()-1;i++){
               square+=(int)Math.pow(1,2);
               hs.clear();
            for(j=i+1;j<=nums.size()-1;j++){
                hs.add(nums.get(i));
                hs.add(nums.get(j));
                square=square+(int)Math.pow(hs.size(),2);
            }
        }
        square=square+1;
        return square;
    }
}