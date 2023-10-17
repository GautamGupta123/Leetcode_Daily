class Solution
{
    long solve(int n, long A[], long b)
    {
        // Complete this function
        int i;
        for(i=0;i<=n-1;i++){
            if(A[i]==b){
                b=b*2;
            }
        }
        return b;
    }
}