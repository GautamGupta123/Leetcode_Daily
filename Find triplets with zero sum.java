import java.util.*;
class Solution
{
	public boolean findTriplets(int arr[] , int n)
    {
        int i,j,k;
        Arrays.sort(arr);
        for(i=0;i<arr.length-2;i++){
            j=i+1;
            k=arr.length-1;
            while(j<k){
                if(arr[i]+arr[j]+arr[k]==0){
                    return true;
                }
                else if(arr[i]+arr[j]+arr[k]>0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return false;
    }
}