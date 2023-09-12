class Solution {
    public int search(int[] nums, int target) {
        int i;
        int ind=-1;
        int n=nums.length;
        for(i=0;i<=n-1;i++){
            if(nums[i]==target){
                ind=i;
                break;
            }
        }
        return ind;
    }
}