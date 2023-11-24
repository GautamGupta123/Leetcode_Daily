class Solution {
    String maxOdd(String s) {
        int i;
        int n=s.length();
        int max=0;
        int flag=0;
        for(i=0;i<=n-1;i++){
            if(s.charAt(i)%2!=0){
                max=i;
                flag++;
            }
        }
        char arr[]=s.toCharArray();
        String ans="";
        if(flag!=0){
        for(i=0;i<=max;i++){
            ans=ans+arr[i];
        }
     }
        return ans;
    }
}