class Solution
{
    int columnWithMaxZeros(int arr[][], int N)
    {
        int i,j;
        int c=0;
        int ans=-1;
        int max=Integer.MIN_VALUE;
        for(i=0;i<=N-1;i++){
            c=0;
            for(j=0;j<=N-1;j++){
                if(arr[j][i]==0){
                    c++;
                }
            }
            if(c>max){
                max=c;
                ans=i;
            }
        }
        if(max==0){
            return -1;
        }
        return ans;
    }
}