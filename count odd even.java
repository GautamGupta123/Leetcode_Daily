class Solution
{
    public void countOddEven(int[] arr, int n)
    {
        // Code here
        int i;
        int e=0;
        int o=0;
        //int arr[]=new int[2];
        for(i=0;i<=n-1;i++){
            if(arr[i]%2==0){
                e++;
            }
            else if(arr[i]%2!=0){
                o++;
            }
        }
       
        System.out.print(o+" ");
        System.out.print(e);
        System.out.println();
       
    }
}