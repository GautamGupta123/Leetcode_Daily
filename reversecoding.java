class Solution {
    static int sumOfNaturals(int n) {
        long i;
        long sum=0;
        for(i=1;i<=n/2;i++){
            sum=sum+i;
        }
        for(i=(n/2)+1;i<=n;i++){
            sum+=i;
        }
        long ans=(long)(sum%(1e9+7));
        return (int)ans;
    }
};