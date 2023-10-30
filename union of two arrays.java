import java.util.*;
class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        HashSet<Integer>hs=new HashSet<Integer>();
        int i;
        for(i=0;i<=a.length-1;i++){
            hs.add(a[i]);
        }
        for(i=0;i<=b.length-1;i++){
            hs.add(b[i]);
        }
        return hs.size();
    }
}