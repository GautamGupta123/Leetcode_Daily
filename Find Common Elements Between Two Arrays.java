class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int  n=nums1.length;
        int m=nums2.length;
        int i,j;
        ArrayList<Integer>ls=new ArrayList<Integer>();
        ArrayList<Integer>ls1=new ArrayList<Integer>();
        for(i=0;i<=n-1;i++){
            ls.add(nums1[i]);
        }
        for(i=0;i<=m-1;i++){
            ls1.add(nums2[i]);
        }
        int c=0;
        int ans[]=new int[2];
        for(i=0;i<=n-1;i++){
            if(ls1.contains(nums1[i])){
                c++;
            }
        }
        ans[0]=c;
        c=0;
         for(i=0;i<=m-1;i++){
            if(ls.contains(nums2[i])){
                c++;
            }
        }
        ans[1]=c;
        return ans;
    }
}