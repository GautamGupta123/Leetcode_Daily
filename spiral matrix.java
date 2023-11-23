import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer>ls=new ArrayList<Integer>();
        int i;
        int n=matrix.length;
        int m=matrix[0].length;
        int left=0;
        int top=0;
        int right=m-1;
        int bottom=n-1;
        while(left<=right && top<=bottom){
        for(i=left;i<=right;i++){
            ls.add(matrix[top][i]);
        }
        top++;
        for(i=top;i<=bottom;i++){
            ls.add(matrix[i][right]);
        }
        right--;
            if(top<=bottom){
        for(i=right;i>=left;i--){
            ls.add(matrix[bottom][i]);
        }
        bottom--;
            }
            if(left<=right){
        for(i=bottom;i>=top;i--){
            ls.add(matrix[i][left]);
        }
        left++;
            }
        }
        return ls;
    }
}