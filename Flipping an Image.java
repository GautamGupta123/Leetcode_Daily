class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int i;
        int j;
        int n=image.length;
        int ans[][]=new int[n][n];
        int l=0;
        int k=0;
        for(i=0;i<=n-1;i++){
            k=0;
            for(j=n-1;j>=0;j--){
                ans[l][k]=image[i][j];
                k++;
            }
            l++;
        }
        for(i=0;i<=n-1;i++){
            for(j=0;j<=n-1;j++){
                if(ans[i][j]==0){
                    ans[i][j]=1;
                }
                else{
                    ans[i][j]=0;
                }
            }
        }
        return ans;
    }
}