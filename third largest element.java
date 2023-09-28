import java.util.*;
class Solution {
    public int thirdMax(int[] nums) {
        int c=3;
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
	    if(n==2){
	        return Math.max(nums[0],nums[1]);
	    }
	    int i;
	    int ind=-1;
	    Arrays.sort(nums);
	    for(i=n-1;i>0;i--){
	        if(nums[i]!=nums[i-1]){
	            c--;
	        }
	        if(c==1){
	            ind=nums[i-1];
	            break;
	        }
	    }
        if(c!=1){
            int max=Integer.MIN_VALUE;
            for(i=0;i<=n-1;i++){
                if(nums[i]>max){
                    max=nums[i];
                }
            }
            return max;
        }
	    return ind;
    }
}