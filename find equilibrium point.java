class Solution {
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        int i;
        // int sum=0;
        if(n==1){
            return 1;
        }
        long ls=0;
        long rs=0;
        for(i=0;i<=n-1;i++){
           ls+=arr[i];
        }
        for(i=n-1;i>=0;i--){
            rs+=arr[i];
            if(ls==rs){
                return i+1;
            }
            ls=ls-arr[i];
        }
      return -1;
        }
}