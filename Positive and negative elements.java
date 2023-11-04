import java.util.*;
class Solution
{
    ArrayList<Long> arranged(long a[], int n)
    {
        int i;
       ArrayList<Long>ls=new ArrayList<Long>();
       ArrayList<Long>pos=new ArrayList<Long>();
       ArrayList<Long>neg=new ArrayList<Long>();
       for(i=0;i<=n-1;i++){
           if(a[i]<0){
               neg.add(a[i]);
           }
       }
       for(i=0;i<=n-1;i++){
           if(a[i]>0){
               pos.add(a[i]);
           }
       }
       for(i=0;i<=pos.size()-1;i++){
           ls.add(pos.get(i));
           ls.add(neg.get(i));
       }
       return ls;
    }
}