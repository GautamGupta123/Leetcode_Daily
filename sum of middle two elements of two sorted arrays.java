import java.util.*;
class Solution {
    int findMidSum(int[] ar1, int[] ar2, int n) {
        // code here
        int i,j=0;
        int ar3[]=new int[n+n];
        int t=ar3.length;
        for(i=0;i<=n-1;i++){
            ar3[i]=ar1[i];
            //j++;
        }
        for(i=n;i<=t-1;i++){
            ar3[i]=ar2[j];
            j++;
        }
        Arrays.sort(ar3);
        int mid =t/2;
        int sum=ar3[mid]+ar3[mid-1];
        return sum;
    }
}