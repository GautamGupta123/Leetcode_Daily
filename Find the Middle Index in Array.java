class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int s=0;
        int sum=0;
        int i,j;
        for(i=0;i<=n-1;i++){
            sum=0;
            if(i==0){
                s=0;
                for(j=1;j<=n-1;j++){
                    sum=sum+nums[j];
                }
                if(sum==s){
                    return 0;
                }
            }
        }
        int suml=0;
        int sumr=0;
        for(i=1;i<n-1;i++){
            sumr=0;
            suml=0;
          for(j=0;j<i;j++){
              suml=suml+nums[j];
          }
            for(j=i+1;j<=n-1;j++){
                sumr=sumr+nums[j];
            }
            // System.out.print(suml);
            // System.out.print(sumr);
            if(sumr==suml){
                return i;
            }
        }
        for(i=0;i<=n-1;i++){
          if(i==(n-1)){
                s=0;
                for(j=0;j<n-1;j++){
                    sum=sum+nums[j];
                }
                if(sum==s){
                    return (n-1);
                }
            }
        }
        return -1;
    }
}