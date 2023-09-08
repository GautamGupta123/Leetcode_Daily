class Solution {
    public int maxSum(int[] nums) {
        int i,j;
        int max=Integer.MIN_VALUE;
        int max1=Integer.MIN_VALUE;
        int n=nums.length;
        int temp;
        int sum=0;
        int temp1;
        int rem1,rem;
        int maxs=-1;
        for(i=0;i<=n-1;i++){
            max=Integer.MIN_VALUE;
            temp=nums[i];
            sum=0;
            max1=Integer.MIN_VALUE;
            while(temp!=0){
                rem=temp%10;
                if(rem>max){
                    max=rem;
                }
                temp=temp/10;
            }
            for(j=0;j<=n-1;j++){
                sum=0;
                max1=Integer.MIN_VALUE;
                if(i==j){
                    continue;
                }
                else{
                 temp1=nums[j];
                while(temp1!=0){
                    rem1=temp1%10;
                    if(rem1>max1){
                        max1=rem1;
                    }
                    temp1=temp1/10;
                }
            if(max==max1){
                sum=nums[i]+nums[j];
                if(sum>maxs){
                    maxs=sum;
                }
              }
                }
            }
        }
        return maxs;
    }
}