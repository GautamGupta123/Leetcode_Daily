class Solution {
    static boolean isprime(int N){
        int i;
        for(i=2;i*i<=N;i++){
            if(N%i==0) return false;
        }
        return true;
    }
    static boolean reverse(int N){
        int rem;
        int rev=0;
        while(N>0){
            rem=N%10;
            rev=rev*10+rem;
            N=N/10;
        }
        int i;
        for(i=2;i*i<=rev;i++){
            if(rev%i==0) return false;
        }
        return true;
    }
    int isTwistedPrime(int N) {
        int i;
        if(isprime(N) && reverse(N)){
            return 1;
        }
        return 0;
    }
}