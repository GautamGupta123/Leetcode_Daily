class Solution {
    int sortedCount(int N, int M, int Mat[][]) {
        int i,j;
        int flag=0;
        int flag1=0;
        int c=0;
        for(i=0;i<=N-1;i++){
            flag=0;
            flag1=0;
            for(j=0;j<M-1;j++){
                if(Mat[i][j]<Mat[i][j+1]){
                    flag++;
                }
                if(Mat[i][j]>Mat[i][j+1]){
                    flag1++;
                }
            }
            if(flag==(M-1) || flag1==(M-1)){
                c++;
            }
        }
        return c;
    }
};