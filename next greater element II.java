class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int i,j;
        int n=nums.length;
        int ans[]=new int[n];
        int flag=0;
        int temp=-1;
        int t=0;
        for(i=0;i<=n-1;i++){
            flag=0;
            t=0;
            if(i==(n-1)){
                for(j=0;j<n-1;j++){
                    if(nums[j]>nums[n-1]){
                        ans[n-1]=nums[j];
                        flag++;
                        break;
                    }
                }
            }
            else{
            for(j=0;j<=n-1;j++){
                if(j==i){
                    temp=j;
                    break;
                }
            }
            for(j=temp+1;j<=n-1;j++){
                if(nums[j]>nums[i]){
                    ans[i]=nums[j];
                    flag++;
                    t++;
                    break;
                }
                if(j==n-1){
                    break;
                }
            }
                if(t==0){
                j=0;
                while(j!=temp){
                    if(nums[j]>nums[i]){
                        ans[i]=nums[j];
                        flag++;
                        break;
                    }
                    j++;
                }
                }
             }
            if(flag==0){
                ans[i]=-1;
            }
        }
        return ans;
    }
}