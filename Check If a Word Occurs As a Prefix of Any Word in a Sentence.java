class Solution {
    public boolean getprefixlen(String str,String sea){
        int p=0;
        for(int i=0;i<sea.length();i++){
            if(sea.charAt(i)==str.charAt(i)){
                p++;
            }
        }
        if(p==sea.length()){
            return true;
        }
        return false;
    }
    public int isPrefixOfWord(String sentence, String searchWord) {
        int i;
        ArrayList<String>ls=new ArrayList<>();
        ArrayList<Integer>ls1=new ArrayList<>();
        StringBuilder s=new StringBuilder();
        for(i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' ' || i==(sentence.length()-1)){
                if(i==sentence.length()-1){
                    s.append(sentence.charAt(sentence.length()-1));
                    ls.add(s.toString());
                }
                else{
                   ls.add(s.toString());
                   s.setLength(0);
                }
            }
            else{
                s.append(sentence.charAt(i));
            }
        }
        for(i=0;i<ls.size();i++){
            if(ls.get(i).length()<searchWord.length()) continue;
            else{
                if(getprefixlen(ls.get(i),searchWord)==true){
                    ls1.add(i+1);
                }
            }
        }
        if(ls1.size()>=1){
            return ls1.get(0);
        }
        return -1;
    }
}