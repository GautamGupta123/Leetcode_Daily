class Complete{
    
   
    // Function for finding maximum and value pair
    public static int multiply (int arr[], int n) {
        //Complete the function
        int lm=0;
        int rm=0;
        for(int i=0;i<n/2;i++){
            lm=lm+arr[i];
        }
        for(int i=n/2;i<=n-1;i++){
            rm=rm+arr[i];
        }
        int sum=lm*rm;
        return sum;
    }
    
    
}