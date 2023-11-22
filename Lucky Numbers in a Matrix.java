import java.util.*;
class Solution {
    public static boolean check(int p,int[][] matrix,int n,int m,int i,int j){
        int flag=0;
        int t;
        for(t=0;t<=m-1;t++){
            if(p==matrix[i][t]){
                continue;
            }
            if(p<matrix[i][t]){
                flag++;
            }
        }
        int flag1=0;
        for(t=0;t<=n-1;t++){
            if(p==matrix[t][j]){
                continue;
            }
            if(p>matrix[t][j]){
                flag1++;
            }
        }
        if(flag==(m-1) && flag1==(n-1)){
            return true;
        }
        return false;
    }
    public List<Integer> luckyNumbers (int[][] matrix) {
        int i,j;
        int n=matrix.length;
        int m=matrix[0].length;
        int p;
        ArrayList<Integer>ls=new ArrayList<Integer>();
        for(i=0;i<=n-1;i++){
            for(j=0;j<=m-1;j++){
                p=matrix[i][j];
                if(check(p,matrix,n,m,i,j)==true){
                    ls.add(matrix[i][j]);
                }
            }
        }
        return ls;
    }
}