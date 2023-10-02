class Solution { 

    static boolean sentencePalindrome(String s) { 
        // code here
        int c=0,i;
        for(i=0;i<=s.length()-1;i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                c++;
            }
        }
        int j=0;
        char ans[]=new char[c];
        for(i=0;i<=s.length()-1;i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                ans[j]=s.charAt(i);
                j++;
           }
        }
        i=0;
        j=ans.length-1;
        int flag=0;
        while(i<=j){
            if(i==j){
                flag+=1;
                break;
            }
            if(ans[i]==ans[j]){
                flag=flag+2;
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        if(flag==c){
            return true;
        }
        return false;
    }
}