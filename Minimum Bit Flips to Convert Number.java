class Solution {
    public int minBitFlips(int start, int goal) {
        StringBuilder s=new StringBuilder();
        int i;
        while(start>=1){
            s.append(start%2);
            start=start/2;
        }
        StringBuilder s1=new StringBuilder();
        while(goal>=1){
            s1.append(goal%2);
            goal=goal/2;
        }
        if(s1.length()<s.length()){
            while((s.length()-s1.length())!=0){
                s1.append(0);
            }
        }
        if(s1.length()>s.length()){
            while((s1.length()-s.length())!=0){
                s.append(0);
            }
        }
        String str1=s1.reverse().toString();
         String str=s.reverse().toString();
        int cnt=0;
        for(i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=str1.charAt(i)){
                cnt++;
            }
            else continue;
          }
        return cnt;
 }
}