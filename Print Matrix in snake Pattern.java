import java.util.*;
class Solution
{
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
       ArrayList<Integer>ans=new ArrayList<Integer>();
       int n=matrix.length;
       int i,j,k;
       for(i=0;i<=n-1;i++){
           if(i%2==0){
           for(j=0;j<=n-1;j++){
               ans.add(matrix[i][j]);
           }
         }
           else if(i%2!=0){
               for(k=n-1;k>=0;k--){
                   ans.add(matrix[i][k]);
               }
           }
       }
       return ans;
    }
}