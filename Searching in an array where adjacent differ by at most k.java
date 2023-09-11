class Complete{
    // Function for finding maximum and value pair
    public static int search (int arr[], int n, int x, int k) {
        //Complete the function
        int i;
        int ind=-1;
        for(i=0;i<=n-1;i++){
            if(arr[i]==x){
                ind=i;
                break;
            }
        }
        return ind;
    }
    
    
}



