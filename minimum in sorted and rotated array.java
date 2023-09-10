class Solution
{
    int findMin(int arr[], int n)
    {
        //complete the function here
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=n-1;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}