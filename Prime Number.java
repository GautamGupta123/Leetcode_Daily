class Solution{
    static int isPrime(int N){
        int i;
        if(N==1) return 0;
        for(i=2;i*i<=N;i++){
            if(N%i==0) return 0;
        }
        return 1;
    }
}