import java.util.*;
class Solution
{
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
       HashSet<Integer>hs=new HashSet<Integer>();
       int i;
       for(i=0;i<=arr1.length-1;i++){
           hs.add(arr1[i]);
       }
       for(i=0;i<=arr2.length-1;i++){
           hs.add(arr2[i]);
       }
      ArrayList<Integer>ls=new ArrayList<Integer>(hs);
      Collections.sort(ls);
       return ls;
    }
}


