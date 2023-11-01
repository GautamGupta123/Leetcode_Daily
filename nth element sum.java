import java.util.*;
class Solution{
    static int nthItem(int L1, int L2, int A[], int B[], int N)
    {
        HashSet<Integer>hs=new HashSet<Integer>();
        int i,j;
        int sum=0;
        for(i=0;i<=L1-1;i++){
            for(j=0;j<=L2-1;j++){
                sum=A[i]+B[j];
                hs.add(sum);
            }
        }
        
        int ans=0;
        ArrayList<Integer>ls=new ArrayList<Integer>(hs);
        Collections.sort(ls);
        int ans1[]=new int[ls.size()];
        for(i=0;i<=ls.size()-1;i++){
            ans1[i]=ls.get(i);
        }
        for(i=0;i<=ans1.length-1;i++){
            if(i==(N-1)){
                ans=ans1[i];
                break;
            }
        }
        if(N>ans1.length){
            return -1;
        }
        return ans;
    }
}