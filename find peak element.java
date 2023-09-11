class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int i;
        int ind=-1;
        if(n==1){
            return 0;
        }
        for(i=0;i<=n-1;i++){
            if(i==0){
                if(nums[0]>nums[1]){
                    ind=0;
                    break;
                }
            }
            else if(i==(n-1)){
                if(nums[n-1]>nums[n-2]){
                    ind=i;
                    break;
                }
            }
            else if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                ind=i;
                break;
            }
        }
        return ind;
    }
}