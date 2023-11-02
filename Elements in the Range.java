import java.util.*;
class Solution
{
    boolean check_elements(int arr[], int n, int A, int B)
    {
            ArrayList<Integer>ls=new ArrayList<Integer>();
            int i;
            for(i=A;i<=B;i++)
            {
                ls.add(i);
            }
            ArrayList<Integer>ls1=new ArrayList<Integer>();
            for(i=0;i<=arr.length-1;i++){
                ls1.add(arr[i]);
            }
            int flag=0;
            for(i=0;i<=ls.size()-1;i++){
                if(ls1.contains(ls.get(i))){
                    flag++;
                }
            }
            if(flag==ls.size()){
                return true;
            }
            return false;
    }
}