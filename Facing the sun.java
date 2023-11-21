class Solution {
    int countBuildings(int h[], int n) {
        int c=1;
        int i;
        int max=h[0];
        for(i=1;i<=n-1;i++){
            if(h[i]>max){
                max=h[i];
               c++;
            }
        }
        return c;
    }
}