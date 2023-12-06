class Solution {
    int countX(int L, int R, int X) {
        int i;
        StringBuilder s=new StringBuilder();
        for(i=L+1;i<R;i++){
            s.append(i);
        }
        int c=0;
        String str=s.toString();
        for(i=0;i<=str.length()-1;i++){
            if(Character.getNumericValue(str.charAt(i))==X){
                c++;
            }
        }
        return c;
    }
};