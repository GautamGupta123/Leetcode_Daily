class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int i,j;
        int n=nums.length;
        int ans[]=new int[n];
        j=0;
        for(i=0;i<=n-1;i++){
            if(nums[i]<pivot){
                ans[j]=nums[i];
                j++;
            }
        }
        for(i=0;i<=n-1;i++){
            if(nums[i]==pivot){
                ans[j]=nums[i];
                j++;
            }
        }
        for(i=0;i<=n-1;i++){
            if(nums[i]>pivot){
                ans[j]=nums[i];
                j++;
            }
        }
        return ans;
    }
}