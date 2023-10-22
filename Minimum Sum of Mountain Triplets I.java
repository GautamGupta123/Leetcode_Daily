class Solution {
    public int minimumSum(int[] nums) {
        int i,j,k;
        int n=nums.length;
        int s=0;
        int sum=Integer.MAX_VALUE;
        int flag=0;
        for(i=0;i<n-2;i++){
            for(j=i+1;j<n-1;j++){
                for(k=j+1;k<=n-1;k++){
                    if(nums[i]<nums[j] && nums[j]>nums[k]){
                        s=nums[i]+nums[j]+nums[k];
                        flag++;
                        if(s<sum){
                            sum=s;
                        }
                    }
                }
            }
        }
        if(flag==0){
            return -1;
        }
        return sum;
    }
}