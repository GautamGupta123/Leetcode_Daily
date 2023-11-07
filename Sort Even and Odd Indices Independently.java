import java.util.*;
class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int i;
        int n=nums.length;
        ArrayList<Integer>ls=new ArrayList<Integer>();
        ArrayList<Integer>ls1=new ArrayList<Integer>();
        for(i=0;i<=nums.length-1;i++){
            if(i%2==0){
                ls.add(nums[i]);
            }
            else{
                ls1.add(nums[i]);
            }
        }
        Collections.sort(ls1,Collections.reverseOrder());
        Collections.sort(ls);
        int j=0;
        int k=0;
        for(i=0;i<=n-1;i++){
            if(i%2==0){
                nums[i]=ls.get(j);
                j++;
            }
            else{
                nums[i]=ls1.get(k);
                k++;
            }
        }
        return nums;
    }
}