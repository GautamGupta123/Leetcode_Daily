class Solution {
    int[] sumClosest(int[] arr, int x) {
        int i=0;
        int n=arr.length;
        int j=n-1;
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;
        int clos=Integer.MAX_VALUE;
        int ans[]=new int[2];
        while(i<j){
            int sum=arr[i]+arr[j];
            if(Math.abs(sum-x)<clos){
                clos=Math.abs(sum-x);
                ele1=arr[i];
                ele2=arr[j];
            }
            if(sum>x){
                j--;
            }
            else{
                i++;
            }
        }
        ans[0]=ele1;
        ans[1]=ele2;
        return ans;
    }
}