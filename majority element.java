class Solution
{
    static int majorityElement(int a[], int s)
    {
        int i;
        int max=Integer.MIN_VALUE;
        for(i=0;i<=s-1;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        int ans[]=new int[max+1];
        for(i=0;i<=s-1;i++){
            ans[a[i]]++;
        }
        int p=ans.length;
        for(i=0;i<=p-1;i++){
            if(ans[i]>s/2){
                return i;
            }
        }
        return -1;
    }
}