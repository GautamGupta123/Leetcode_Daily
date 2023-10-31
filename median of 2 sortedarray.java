import java.util.*;
class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
         ArrayList<Integer>ls=new ArrayList<Integer>();
         int i;
         for(i=0;i<=a.length-1;i++){
             ls.add(a[i]);
         }
         for(i=0;i<=b.length-1;i++){
             ls.add(b[i]);
         }
         Collections.sort(ls);
         double ans=0;
         if(ls.size()%2!=0){
             ans=(double)ls.get(ls.size()/2);
             return ans;
         }
          ans=(double)((ls.get((ls.size()/2)-1))+(ls.get(ls.size()/2)))/2;
         return ans;
    }
}