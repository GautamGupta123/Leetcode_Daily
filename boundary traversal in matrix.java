import java.util.*;
class Solution
{
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        int i,j;
        ArrayList<Integer>ls=new ArrayList<Integer>();
        if(n==1){
            for(i=0;i<=m-1;i++){
                ls.add(matrix[0][i]);
            }
            return ls;
        }
        if(m==1){
            for(i=0;i<=n-1;i++){
                ls.add(matrix[i][0]);
            }
            return ls;
        }
        
        for(i=0;i<=m-1;i++){
           ls.add(matrix[0][i]);
        }
       for(i=1;i<=n-1;i++){
           ls.add(matrix[i][m-1]);
       }
       for(i=m-2;i>=0;i--){
           ls.add(matrix[n-1][i]);
       }
        
       for(i=n-2;i>0;i--){
           ls.add(matrix[i][0]);
       }
        return ls;
    }
}