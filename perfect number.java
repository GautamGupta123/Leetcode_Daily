class Solution {
    static int isPerfectNumber(long N) {
        // code here
        long i;
        if(N==1){
            return 0;
        }
        long sum=1;
        for(i=2;i*i<=N;i++){
            if(N%i==0){
            sum=sum+i+N/i;
            }
        }
        //sum=sum+1;
        if(sum==N){
            return 1;
        }
      return 0;
    }
};