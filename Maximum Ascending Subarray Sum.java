class Solution {
    public int maxAscendingSum(int[] nums) {
        int i,j;
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(i=0;i<n-1;i++){
            if(nums[i]<nums[i+1]){
                sum+=nums[i];
            }
            else{
                sum+=nums[i];
                if(sum>max){
                  max=sum;
                }
                sum=0;
            }
        }
        if(nums[n-2]<nums[n-1]){
            sum+=nums[n-1];
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}