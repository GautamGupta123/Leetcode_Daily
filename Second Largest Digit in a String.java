import java.util.*;
class Solution {
    public int secondHighest(String s) {
        HashSet<Integer>hs=new HashSet<Integer>();
        int i;
        for(i=0;i<=s.length()-1;i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                hs.add(Character.getNumericValue(s.charAt(i)));
            }
        }
        ArrayList<Integer>ls=new ArrayList<Integer>(hs);
        Collections.sort(ls);
        int p=2;
        int ans=0;
        if(ls.size()==1 || ls.size()==0){
            return -1;
        }
        if(ls.size()==2 && ls.get(1)>ls.get(0)){
            return ls.get(0);
        }
        for(i=ls.size()-1;i>=0;i--){
            if(ls.get(i)!=ls.get(i-1) && ls.get(i)>ls.get(i-1)){
                p--;
            }
            if(ls.get(i)==ls.get(i-1)){
                continue;
            }
            if(p==0){
                ans=ls.get(i);
                break;
            }
        }
        return ans;
    }
}