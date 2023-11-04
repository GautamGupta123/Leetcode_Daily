import java.util.*;
class GFG
{
    public static int[] find(int a[],int b[],int q[])
    {
        ArrayList<Integer>ls=new ArrayList<Integer>();
        int i,j;
        int c=0;
        for(i=0;i<=q.length-1;i++){
            c=0;
            int p=a[q[i]];
            for(j=0;j<=b.length-1;j++){
                if(p>=b[j]){
                    c++;
                }
            }
            ls.add(c);
        }
        int ans[]=new int[ls.size()];
        for(i=0;i<=ls.size()-1;i++){
            ans[i]=ls.get(i);
        }
        return ans;
    }
}