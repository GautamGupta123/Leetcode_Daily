class Solution {
    public boolean hasAlternatingBits(int n) {
        String str="";
        while(n>0){
            str=str+n%2;
            n=n/2;
        }
        int i;
        int flag=0;
        for(i=0;i<str.length()-1;i++){
            if(str.charAt(i)!=str.charAt(i+1)){
                flag++;
            }
            else {
                return false;
            }
        }
        if(flag==(str.length()-1)){
            return true;
        }
        return false;
    }
}