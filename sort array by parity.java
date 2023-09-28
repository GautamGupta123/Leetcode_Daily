class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int ans[]=new int[nums.length];
        int n=nums.length;
        int i;
        int j=0;
        if(n==1){
            return nums;
        }
        for(i=0;i<=n-1;i++){
            if(nums[i]%2==0){
                ans[j]=nums[i];
                j++;
            }
        }
        int temp=j;
        for(i=0;i<=n-1;i++){
            if(nums[i]%2!=0){
                ans[temp]=nums[i];
                temp++;
            }
        }
        return ans;
    }
}