class Solution {
    public static boolean check(int[][] mat,int n,int m,int i,int j){
        int t,h;
        int flag=0;
        for(t=0;t<=m-1;t++){
            if(mat[i][t]==0){
                flag++;
            }
        }
        int flag1=0;
        for(h=0;h<=n-1;h++){
            if(mat[h][j]==0){
                flag1++;
            }
        }
        if(flag==(m-1) && flag1==(n-1)){
            return true;
        }
        return false;
    }
    public int numSpecial(int[][] mat) {
        int i,j;
        int n=mat.length;
        int m=mat[0].length;
        int c=0;
        for(i=0;i<=n-1;i++){
            for(j=0;j<=m-1;j++){
                if(mat[i][j]==1){
                    if(check(mat,n,m,i,j)==true){
                        c++;
                    }
                }
            }
        }
        return c;
    }
}