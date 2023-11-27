class Solution {
    long sumOfSeries(long N) {
       long ans=0;
       long i;
       for(i=1;i<=N;i++){
           ans+=(long)Math.pow(i,3);
       }
       return ans;
    }
}