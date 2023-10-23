import java.util.*;
class Solution
{
    public int findPeakElement(List<Integer> a)
    {
        int a1=0;
        int i;
        int n=a.size();
        for(i=0;i<n-1;i++){
            if(a.get(i)>a.get(i+1) && a.get(i)>a.get(i-1))
              {
                  a1=a.get(i);
                  break;
              }
        }
        return a1;
    }
}