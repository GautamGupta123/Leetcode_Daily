import java.util.*;
class Compute {  
    public static int missingNumber(int A[], int N)
    {
         HashSet<Integer>hs=new HashSet<Integer>();
         int i;
         for(i=0;i<=A.length-1;i++){
             hs.add(A[i]);
         }
         int ans=0;
         for(i=1;i<=N;i++)
         {
             if(!hs.contains(i)){
                 ans=i;
             }
         }
         return ans;
    }
}