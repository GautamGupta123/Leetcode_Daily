class Solution {
    static int countNumberswith4(int N) {
        int i;
        int c=0;
        for(i=1;i<=N;i++){
            StringBuilder s=new StringBuilder();
            s.append(i);
            String str=s.toString();
            if(str.contains("4")){
                c++;
            }
        }
        return c;
    }
};