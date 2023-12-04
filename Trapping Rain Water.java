class Solution {
    public int trap(int[] height) {
        int i;
        int n=height.length;
        ArrayList<Integer>left=new ArrayList<Integer>();
        ArrayList<Integer>right=new ArrayList<Integer>();
        int max1=Integer.MIN_VALUE;
        for(i=0;i<=n-1;i++){
            if(height[i]>max1){
                max1=height[i];
            }
            left.add(max1);
        }
        int max2=Integer.MIN_VALUE;
        for(i=n-1;i>=0;i--){
            if(height[i]>max2){
                max2=height[i];
            }
            right.add(max2);
        }
        int trap=0;
        int p=0;
        int j=right.size()-1;
        for(i=0;i<=left.size()-1;i++){
            trap+=(Math.min(left.get(i),right.get(j))-height[i]);
            j--;
        }
        return trap;
    }
}