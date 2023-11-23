import java.util.*;
class Solution
{
    public int[] reverseSpiral(int R, int C, int[][] a)
    {
       ArrayList<Integer>ls=new ArrayList<Integer>();
         int left=0;
         int right=C-1;
         int top=0;
         int bottom=R-1;
         int i;
         while(left<=right && top<=bottom){
             for(i=left;i<=right;i++){
                 ls.add(a[top][i]);
             }
             top++;
             for(i=top;i<=bottom;i++){
                 ls.add(a[i][right]);
             }
             right--;
             if(top<=bottom){
             for(i=right;i>=left;i--){
                 ls.add(a[bottom][i]);
             }
             bottom--;
             }
             if(left<=right){
             for(i=bottom;i>=top;i--){
                 ls.add(a[i][left]);
             }
             left++;
             }
         }
         int ans[]=new int[ls.size()];
         int j=0;
         for(i=ls.size()-1;i>=0;i--){
             ans[j]=ls.get(i);
             j++;
         }
         return ans;
    }
}