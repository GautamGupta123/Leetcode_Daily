import java.util.*;
class Solution{
    // Function for finding maximum and value pair
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        // code here
        ArrayList<Integer> ls=new ArrayList<Integer>();
        int i=0;
        int j=m-1;
        int mindif=Integer.MAX_VALUE;
        int ele1=Integer.MIN_VALUE,ele2=Integer.MIN_VALUE;
        int sum;
        while(i<n && j>=0){
            sum=arr[i]+brr[j];
            if(Math.abs(sum-x)<mindif){
                mindif=Math.abs(sum-x);
                ele1=arr[i];
                ele2=brr[j];
            }
            if(sum>x){
                j--;
            }
            else{
                i++;
            }
        }
        ls.add(ele1);
        ls.add(ele2);
        return ls;
    }
}