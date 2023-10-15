class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
     int i,j;
        int ans[]=new int[2];
        int flag=0;
        i=0;
        int n=nums.length;
        j=n-1;
        while(i<=j){
            if(Math.abs(i-j)>=indexDifference && Math.abs(nums[i]-nums[j])>=valueDifference){
                ans[0]=i;
                ans[1]=j;
                flag++;
                break;
            }
            else if(j==(i+1)){
                i++;
                j=n-1;
            }
            else{
                j--;
            }
        }
        if(flag==0){
            ans[0]=-1;
            ans[1]=-1;
        }
        return ans;
    }
}