class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String>ls=new ArrayList<>();
        StringBuilder s=new StringBuilder();
        int i;
        for(i=0;i<s1.length();i++){
            if(s1.charAt(i)==' ' || i==s1.length()-1){
                if(i==s1.length()-1){
                    s.append(s1.charAt(s1.length()-1));
                    ls.add(s.toString());
                    s.setLength(0);
                }
                else{
                    ls.add(s.toString());
                    s.setLength(0);
                }
            }
            else s.append(s1.charAt(i));
        }
        ArrayList<String>ls1=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for(i=0;i<s2.length();i++){
            if(s2.charAt(i)==' ' || i==s2.length()-1){
                if(i==s2.length()-1){
                    sb.append(s2.charAt(s2.length()-1));
                    ls1.add(sb.toString());
                    sb.setLength(0);
                }
                else{
                    ls1.add(sb.toString());
                    sb.setLength(0);
                }
            }
            else sb.append(s2.charAt(i));
        }
        ArrayList<String>ans=new ArrayList<>();
        HashMap<String,Integer>hm=new HashMap<>();
        for(i=0;i<ls.size();i++){
            hm.put(ls.get(i),hm.getOrDefault(ls.get(i),0)+1);
        }
        for(Map.Entry h1:hm.entrySet()){
            if((int)h1.getValue()==1 && !ls1.contains((String)h1.getKey())){
                ans.add((String)h1.getKey());
            }
        }
        hm.clear();
        for(i=0;i<ls1.size();i++){
            hm.put(ls1.get(i),hm.getOrDefault(ls1.get(i),0)+1);
        }
        for(Map.Entry h2:hm.entrySet()){
            if((int)h2.getValue()==1 && !ls.contains((String)h2.getKey())){
                ans.add((String)h2.getKey());
            }
        }
        String ans1[]=new String[ans.size()];
        for(i=0;i<ans.size();i++){
            ans1[i]=ans.get(i);
        }
        return ans1;
    }
}