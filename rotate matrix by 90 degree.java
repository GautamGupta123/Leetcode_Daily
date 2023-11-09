class Solution
{
    static void rotateby90(int matrix[][], int n) 
    { 
        int ans[][]=new int[n][n];
        int i,j;
        for(i=0;i<=n-1;i++){
            for(j=0;j<=n-1;j++){
                ans[i][j]=matrix[i][j];
            }
        }
        int l=0;
        int k=0;
        for(i=n-1;i>=0;i--){
            k=0;
            for(j=0;j<=n-1;j++){
                matrix[l][k]=ans[j][i];
                k++;
            }
            l++;
        }
    }
}