class Solution {
    public int maxProduct(int[] nums) {
        int i;
        int prod=1;
        int res=Integer.MIN_VALUE;
        int n=nums.length;
        for(i=0;i<=n-1;i++){
            prod=prod*nums[i];
            res=Math.max(res,prod);
            if(prod==0){
                prod=1;
            }
        }
        prod=1;
        for(i=n-1;i>=0;i--){
            prod=prod*nums[i];
            res=Math.max(res,prod);
            if(prod==0){
                prod=1;
            }
        }
        return res;
    }
}