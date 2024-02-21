class Solution {
    public boolean isCircularSentence(String sentence) {
        ArrayList<String>ls=new ArrayList<>();
        int i;
        StringBuilder s=new StringBuilder();
        for(i=0;i<sentence.length();i++){
            if(i==sentence.length()-1){
                s.append(sentence.charAt(sentence.length()-1));
                 ls.add(s.toString());
                s.setLength(0);
            }
            if(sentence.charAt(i)==' '){
                ls.add(s.toString());
                s.setLength(0);
            }
            else{
                s.append(sentence.charAt(i));
            }
        }
        ArrayList<Character>ls1=new ArrayList<>();
        for(i=0;i<ls.size();i++){
            ls1.add(ls.get(i).charAt(0));
            ls1.add(ls.get(i).charAt(ls.get(i).length()-1));
        }
        int cnt=0;
        if(ls1.size()==2 && ls1.get(0)==ls1.get(ls1.size()-1)){
            return true;
        }
         if(ls1.size()==2 && ls1.get(0)!=ls1.get(ls1.size()-1)){
            return false;
        }
        for(i=1;i<ls1.size()-1;i=i+2){
            if(ls1.get(i)==ls1.get(i+1)){
                cnt++;
            }
            else{
                return false;
            }
        }
        if(ls1.get(ls1.size()-1)==ls1.get(0)){
            cnt++;
        }
        if(ls1.get(ls1.size()-1)!=ls1.get(0)){
            return false;
        }
        if(ls1.size()%cnt==0){
            return true;
        }
        return false;
    }
}