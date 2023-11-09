import java.util.*;
class Solution
{
    public int[] BoundaryElements(int[][] matrix)
    {
        ArrayList<Integer>ls=new ArrayList<Integer>();
        int ans1[]=new int[1];
         int n=matrix.length;
        int i,j;
        if(n==1)
        {
            ans1[0]=matrix[0][0];
            return ans1;
        }
        for(i=0;i<=n-1;i++){
            for(j=0;j<=n-1;j++){
                if(i==0){
                    ls.add(matrix[i][j]);
                }
                else{
                    break;
                }
            }
        }
        for(i=1;i<n-1;i++){
                ls.add(matrix[i][0]);
                ls.add(matrix[i][n-1]);
        }
        for(i=0;i<=n-1;i++){
            for(j=0;j<=n-1;j++){
                if(i==(n-1)){
                    ls.add(matrix[i][j]);
                }
                else{
                    break;
                }
            }
        }
        int ans[]=new int[ls.size()];
        for(i=0;i<=ls.size()-1;i++){
            ans[i]=ls.get(i);
        }
        return ans;
    }
}