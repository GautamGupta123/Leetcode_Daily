class Solution
{
    public void transpose(int n,int a[][])
    {
        int i,j;
        int ans[][]=new int[n][n];
        for(i=0;i<=n-1;i++){
            for(j=0;j<=n-1;j++){
                ans[i][j]=a[i][j];
            }
        }
        for(i=0;i<=n-1;i++){
            for(j=0;j<=n-1;j++)
            {
                a[j][i]=ans[i][j];
            }
        }
    }
}