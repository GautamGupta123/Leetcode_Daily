import java.util.*;
class Solution 
{ 
    String sort(String s) 
    {
        char arr[]=s.toCharArray();
        Arrays.sort(arr);
        int i;
        String ans="";
        for(i=0;i<=s.length()-1;i++){
            ans+=arr[i];
        }
        return ans;
    }
} 