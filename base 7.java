class Solution {
    public String convertToBase7(int num) {
        StringBuilder s=new StringBuilder();
        int t=num;
        int p=Math.abs(num);
        if(num==0){
            return "0";
        }
        while(p!=0){
            int rem=p%7;
            s.append(rem);
            p=p/7;
        }
        if(t<0){
           s.append('-');
        }
        return s.reverse().toString();
    }
}