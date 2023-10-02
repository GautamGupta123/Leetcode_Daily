class Solution{
    int Countpair(int a[], int n, int sum)
    {
        int i=0;
        int j=n-1;
        int c=0;
        int sum1=-1;
        int flag=0;
        while(i<j){
            sum1=a[i]+a[j];
            if(sum1==sum){
                flag++;
                c++;
            }
            if(sum1>sum){
                j--;
            }
            else{
                i++;
            }
        }
        if(flag==0){
            return -1;
        }
        return c;
    }
}