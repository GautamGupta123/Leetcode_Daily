class Solution{
    static int Count(String S)
    {
        int c=0;
        int i;
        for(i=0;i<=S.length()-1;i++){
            if((S.charAt(i)>='a' && S.charAt(i)<='z') || (S.charAt(i)>='A' && S.charAt(i)<='Z')){
                c++;
            }
        }
        return c;
    }
}