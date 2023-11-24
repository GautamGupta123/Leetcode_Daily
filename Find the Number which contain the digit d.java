import java.util.*;
class Solution
{
    public Vector<Integer> solve(int n, int d)
    {
        Vector<Integer>vec=new Vector<Integer>();
        int i;
        StringBuilder s1=new StringBuilder();
        s1.append(d);
        String str1=s1.toString();
        for(i=0;i<=n;i++){
            StringBuilder s=new StringBuilder();
            s.append(i);
            String str=s.toString();
            if(str.contains(str1)){
                vec.add(Integer.parseInt(str));
            }
        }
        if(vec.size()==0){
            vec.add(-1);
        }
         return vec;
    }
}