import java.util.*;
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer>ls=new ArrayList<>();
        int i;
        StringBuilder s=new StringBuilder();
        s.append(x);
        String ans=s.toString();
        for(i=0;i<=words.length-1;i++){
            if(words[i].contains(ans)){
                ls.add(i);
            }
        }
        return ls;
    }
}