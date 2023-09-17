class Solution {
    public boolean hasAlternatingBits(int n) {
        StringBuilder str=new StringBuilder();
        while(n>0){
            str.append(n%2);
            n=n/2;
        }
        int i;
        int flag=0;
        String str1=str.toString();
        for(i=0;i<str1.length()-1;i++){
            if(str1.charAt(i)!=str1.charAt(i+1)){
                flag++;
            }
            else {
                return false;
            }
        }
        if(flag==(str1.length()-1)){
            return true;
        }
        return false;
    }
}