class Solution {
    public static void convertToWave(int n, int[] a) {
        int temp;
        int i;
        for(i=0;i<n-1;i=i+2){
            if(a[i]<a[i+1]){
                temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
            if(i==(n-2)){
                break;
            }
        }
    }
}