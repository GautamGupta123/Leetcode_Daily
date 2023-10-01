class Solution {
    public long maximumTripletValue(int[] nums) {
        int i,j,k;
        int n=nums.length;
        long max=0;
        long m=0;
        for(i=0;i<n-2;i++){
            for(j=i+1;j<n-1;j++){
                for(k=j+1;k<n;k++){
                     m=(long)(nums[i]-nums[j])*nums[k];
                    if(m>max){
                          max=m;
                    }
                }
            }
        }
        System.out.print(m);
        return max;
    }
}