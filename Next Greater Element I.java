class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int i,j;
        int n=nums1.length;
        int m=nums2.length;
        int ans[]=new int[n];
        int temp=-1;
        int flag=0;
        for(i=0;i<=n-1;i++){
            flag=0;
            for(j=0;j<=m-1;j++){
                if(nums1[i]==nums2[j]){
                    temp=j;
                    break;
                }
            }
            for(j=temp;j<=m-1;j++){
                if(nums2[j]>nums1[i]){
                    flag++;
                    ans[i]=nums2[j];
                    break;
                }
            }
            if(flag==0){
                ans[i]=-1;
            }
        }
        return ans;
    }
}