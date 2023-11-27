import java.util.*;
class Solution {
    static String findMax(String N) {
        int i;
       ArrayList<Integer>ls=new ArrayList<Integer>();
       for(i=0;i<=N.length()-1;i++){
           ls.add(Character.getNumericValue(N.charAt(i)));
       }
       StringBuilder s=new StringBuilder();
       Collections.sort(ls);
       for(i=ls.size()-1;i>=0;i--){
           s.append(ls.get(i));
       }
       return s.toString();
    }
};