import java.util.*;
class Solution {
    public List<String> stringMatching(String[] words) {
        int i;
        int j;
        ArrayList<String>ls=new ArrayList<String>();
        for(i=0;i<=words.length-1;i++){
            for(j=0;j<=words.length-1;j++){
                if(i==j){
                    continue;
                }
                else{
                   if(words[i].contains(words[j])){
                       ls.add(words[j]);
                   }
                }
            }
        }
        HashSet<String>hs=new HashSet<String>(ls);
        ArrayList<String>ls1=new ArrayList<String>(hs);
        return ls1;
    }
}