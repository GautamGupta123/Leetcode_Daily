class Solution
{
    static int searchInsertK(int Arr[], int N, int k)
    {
        // code here
        int i=0;
        int j=N-1;
        int mid=(i+j)/2;
        int flag=0;
        for(i=0;i<=N-1;i++){
            if(Arr[i]==k){
                flag++;
                return i;
            }
        }
   
        if(flag==0){
            for(i=0;i<N-1;i++){
                if(k<Arr[0]){
                    return 0;
                }
               else if(k>Arr[N-1]){
                    return N;
                }
                else if(k>=Arr[i] && k<=Arr[i+1]){
                    return i+1;
                }
            }
        }
        return i+1;
    }
}