import java.util.*;
class Solution
{
    ArrayList<Long> findMissing(long A[], long B[], int N, int M)
    {
       ArrayList<Long>ls1=new ArrayList<Long>();
       HashSet<Long>ls2=new HashSet<Long>();
       for(int i=0;i<=M-1;i++){
           ls2.add(B[i]);
       }
      int i;
       for(i=0;i<=N-1;i++){
           if(!ls2.contains(A[i])){
               ls1.add(A[i]);
           }
       }
       return ls1;
    }
}