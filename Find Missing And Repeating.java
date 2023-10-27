class Solve {
    int[] findTwoElement(int arr[], int n) {
       int i;
       int ans[]=new int[2];
       int arr1[]=new int[n+1];
       for(i=0;i<=n-1;i++){
           arr1[arr[i]]++;
       }
      int flag=0;
       for(i=1;i<=arr1.length-1;i++){
           if(arr1[i]==0){
               flag++;
               ans[1]=i;
           }
            if(arr1[i]==2){
                flag++;
                ans[0]=i;
           }
           if(flag==2){
               break;
           }
       }
       return ans;
    }
}