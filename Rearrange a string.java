import java.util.*;
class Solution
{
    public String arrangeString(String s)
        {
            int i;
            int n=s.length();
            StringBuilder s1=new StringBuilder();
            if(n==1){
                s1.append(s.charAt(0));
                return s1.toString();
            }
            for(i=0;i<=n-1;i++){
                if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                    s1.append(s.charAt(i));
                }
            }
            String str=s1.toString();
            
            char a[]=str.toCharArray();
            Arrays.sort(a);
            String ans="";
            int sum=0;
            for(i=0;i<=n-1;i++){
                if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                    sum+=Character.getNumericValue(s.charAt(i));
                }
            }
            for(i=0;i<=a.length-1;i++){
                ans+=a[i];
            }
            //System.out.print(sum);
            StringBuilder s2=new StringBuilder();
            s2.append(sum);
            String ans1=s2.toString();
            String ans2=ans+ans1;
            return ans2;
        }
}