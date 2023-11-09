import java.util.*;
class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
        
        // int ans[][]=new int[N][N];
        ArrayList<Integer>ls=new ArrayList<Integer>();
        int i,j;
        for(i=0;i<=N-1;i++){
            for(j=0;j<=N-1;j++)
            {
                ls.add(Mat[i][j]);
            }
        }
        Collections.sort(ls);
        int k=0;
        for(i=0;i<=N-1;i++){
            for(j=0;j<=N-1;j++){
                Mat[i][j]=ls.get(k);
                k++;
            }
        }
        return Mat;
    }
};