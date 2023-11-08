import java.util.*;
class Solution
{
	public static int kthSmallest(int[][]mat,int n,int k)
	{
       ArrayList<Integer>ls=new ArrayList<Integer>();
       int i,j;
       for(i=0;i<=n-1;i++){
           for(j=0;j<=n-1;j++){
               ls.add(mat[i][j]);
           }
       }
       Collections.sort(ls);
       int ans=0;
       for(i=0;i<=ls.size()-1;i++){
           if(i==(k-1)){
               ans=ls.get(i);
               break;
           }
       }
       return ans;
    }
}