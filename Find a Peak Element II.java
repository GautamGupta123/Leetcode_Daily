class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int i,j;
        int n=mat.length;
        int res[]=new int[2];
        int m=mat[0].length;
        int t=0;
        int res1=-1;
        int res2=-1;
        if(n==1 && m==1){
              return res;
        }
        if(n==1 && m!=1){
            for(i=0;i<m;i++){
                res1=Math.max(res1,mat[0][i]);
                res[0]=0;
                res[1]=i;
            }
            return res;
        }
        if(n!=1 && m==1){
            for(i=0;i<n;i++){
                res2=Math.max(res2,mat[i][0]);
                res[0]=i;
                res[1]=0;
            }
            return res;
        }
        for(i=0;i<=n-1;i++){
            for(j=0;j<=m-1;j++){
                if(i==0){
                    if(j==0){
                        if(mat[i][0]>mat[i+1][0] && mat[i][0]>mat[i][j+1]){
                            t++;
                            res[0]=i;
                            res[1]=j;
                            break;
                        }
                    }
                    if(j==(m-1)){
                        if(mat[0][j]>mat[0][j-1] && mat[0][j]>mat[i+1][j]){
                            t++;
                            res[0]=i;
                            res[1]=j;
                            break;
                        }
                    }
                }
                if(i==(n-1)){
                    if(j==0){
                        if(mat[i][j]>mat[i-1][j] && mat[i][j]>mat[i][j+1]){
                            t++;
                            res[0]=i;
                            res[1]=j;
                        break;
                        }
                    }
                    if(j==(m-1)){
                        if(mat[i][j]>mat[i][j-1] && mat[i][j]>mat[i-1][j]){
                            t++;
                            res[0]=i;
                            res[1]=j;
                            break;
                        }
                    }
                }
                if(j!=0 && j!=(m-1)){
                    if(i==0){
                        if(mat[i][j]>mat[i+1][j] && mat[i][j]>mat[i][j-1] && mat[i][j]>mat[i][j+1]){
                            t++;
                            res[0]=i;
                            res[1]=j;
                            break;
                        }
                    }
                    if(i==(n-1)){
                        if(mat[i][j]>mat[i][j-1] && mat[i][j]>mat[i][j+1] && mat[i][j]>mat[i-1][j]){
                             t++;
                            res[0]=i;
                            res[1]=j;
                            break;
                        }
                    }
                }
                if(i!=0 && i!=(n-1)){
                    if(j==0){
                    if(mat[i][j]>mat[i][j+1] && mat[i][j]>mat[i-1][j] && mat[i][j]>mat[i+1][j]){
                        t++;
                        res[0]=i;
                        res[j]=j;
                        break;
                    }
                    }
                    if(j==(m-1)){
                         if(mat[i][j]>mat[i][j-1] && mat[i][j]>mat[i-1][j] && mat[i][j]>mat[i+1][j]){
                             t++;
                        res[0]=i;
                        res[j]=j;
                             break;
                    }
                  }
                }
                if((i!=n-1 && i!=0) && (j!=0 && j!=(m-1))){
                if(mat[i][j]>mat[i+1][j] && mat[i][j]>mat[i-1][j] && mat[i][j]>mat[i][j+1] && mat[i][j]>mat[i][j-1]){
                    t++;
                    res[0]=i;
                    res[1]=j;
                    break;
                }
               }
            }
            if(t!=0) break;
        }
        return res;
    }
}