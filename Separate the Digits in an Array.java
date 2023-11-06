class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder s=new StringBuilder();
        int i;
        for(i=0;i<=nums.length-1;i++){
            s.append(nums[i]);
        }
        String str=s.toString();
        int ans[]=new int[str.length()];
        for(i=0;i<=str.length()-1;i++){
            ans[i]=Character.getNumericValue(str.charAt(i));
        }
        return ans;
    }
}