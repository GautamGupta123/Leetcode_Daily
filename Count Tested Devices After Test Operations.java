class Solution {
    public int countTestedDevices(int[] b) {
        int i,j;
        int n=b.length;
        int op=0;
        for(i=0;i<n-1;i++){
            if(b[i]>0){
                op++;
                for(j=i+1;j<=n-1;j++){
                    if(b[j]>0){
                       b[j]=b[j]-1;
                    }
                }
            }
            else continue;
        }
        if(b[n-1]>0){
            op++;
        }
        return op;
    }
}