class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int i;
        StringBuilder s1=new StringBuilder();
        for(i=0;i<=words.length-1;i++){
            s1.append(words[i]);
            if(s.contains(s1.toString())){
               if(s.equals(s1.toString())){
                return true;
             }
            }
        }
        return false;
    }
}