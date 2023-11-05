class Solution
{
	public int peakElement(int[] arr,int n)
    {
       int i;
      if(n==1){
          return 0;
      }
       if(n==2){
           if(arr[0]>arr[1]){
               return 0;
           }
           else {
               return 1;
           }
       }
       if(arr[0]>arr[1]){
           return 0;
       }
       for(i=1;i<n-1;i++){
           if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
               return i;
           }
       }
       if(arr[n-1]>arr[n-2]){
           return (n-1);
       }
       return 1;
    }
}