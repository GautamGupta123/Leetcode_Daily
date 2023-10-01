class Solution {
    int minRow(int N, int M, int A[][]) {
        // code here
        int i,j;
        int ans=-1;
        int c=0;
        int min=Integer.MAX_VALUE;
        for(i=0;i<N;i++){
            c=0;
            for(j=0;j<M;j++){
                if(A[i][j]==1){
                    c++;
                }
            }
            if(c<min){
                min=c;
                ans=i+1;
            }
        }
        return ans;
    }
};