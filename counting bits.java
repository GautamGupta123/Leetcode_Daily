class Solution {
    public static int count(int n){
        int cnt=0;
        int rem;
        while(n>0)
        {
            rem=n%2;
            if(rem==1)
            {
                cnt++;
            }
            n=n/2;
        }
        return cnt;
    }
    public int[] countBits(int n) {
        int i,j=0;
        int c;
        int ans[]=new int[n+1];
        for(i=0;i<=n;i++){
            c=count(i);
            ans[j]=c;
            j++;
        }
        return ans;
    }
}