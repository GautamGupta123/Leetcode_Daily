class Solution{
    static long sumOfDivisors(int N){
        int i;
        long sum=0;
        for(i=1;i<=N;i++){
            sum+=i*(N/i);
        }
        return sum;
    }
}