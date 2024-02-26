class Solution {
    public int maximum69Number (int num) {
        int ans=num;
        if(num==9) return num;
        StringBuilder s=new StringBuilder();
        s.append(num);
        String str=s.toString();
        int c=0;
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)=='6' && c!=1){
                s1.append('9');
                c++;
            }
            else s1.append(str.charAt(i));
        }
        int d=0;
        String str1=s1.toString();
        int n=str1.length()-1;
        for(int i=0;i<str1.length();i++){
            d+=Character.getNumericValue(str1.charAt(i))*(int)Math.pow(10,n);
            n--;
        }
        return d;
    }
}