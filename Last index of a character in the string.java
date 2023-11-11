class Solution{
    int LastIndex(String s, char p){
       int ind=-1;
       int i;
       for(i=0;i<=s.length()-1;i++){
           if(s.charAt(i)==p){
               ind=i;
           }
       }
       return ind;
    }
}
