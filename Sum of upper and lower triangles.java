import java.util.*;
class Solution
{
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
       ArrayList<Integer>ls=new ArrayList<Integer>();
       int i,j;
       int sum=0;
       int sum1=0;
       for(i=0;i<=n-1;i++){
           for(j=0;j<=n-1;j++){
               if(i==j){
                   sum+=matrix[i][i];
               }
               if(i<j){
                   sum+=matrix[i][j];
               }
           }
       }
       for(i=0;i<=n-1;i++){
           for(j=0;j<=n-1;j++){
               if(i==j){
                   sum1+=matrix[i][i];
               }
               if(i>j){
                   sum1+=matrix[i][j];
               }
           }
       }
       ls.add(sum);
       ls.add(sum1);
       return ls;
    }
}