import java.util.*;
class Solution
{
    public int find_xor(int n)
    {
       ArrayList<Integer>ls=new ArrayList<Integer>();
       while(n>=1){
           ls.add(n%2);
           n=n/2;
       }
       int i;
       int one=0;
       int zero=0;
       for(i=0;i<=ls.size()-1;i++){
           if(ls.get(i)==1){
               one++;
           }
           else{
               zero++;
           }
       }
       int ans=one^zero;
       return ans;
    }
}