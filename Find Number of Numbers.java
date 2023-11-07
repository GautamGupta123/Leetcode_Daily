class GfG
{
          public static int num(int a[], int n, int k)
            {
                 StringBuilder s=new StringBuilder();
                 int i;
                 for(i=0;i<=n-1;i++){
                     s.append(a[i]);
                 }
                 int c=0;
                 String s1=s.toString();
                 for(i=0;i<=s1.length()-1;i++){
                     if(Character.getNumericValue(s1.charAt(i))==k){
                         c++;
                     }
                 }
                 return c;
            }
}