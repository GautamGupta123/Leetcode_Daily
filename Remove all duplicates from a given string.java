class Solution {
    String removeDuplicates(String str) {
       ArrayList<Character>ls=new ArrayList<>();
       int i;
       HashSet<Character>hs=new HashSet<>();
       for(i=0;i<str.length();i++){
           hs.add(str.charAt(i));
       }
       HashSet<Character>hs1=new HashSet<>();
       for(i=0;i<str.length();i++){
           if(hs.contains(str.charAt(i)) && !hs1.contains(str.charAt(i))){
               hs1.add(str.charAt(i));
               ls.add(str.charAt(i));
           }
       }
       StringBuilder s=new StringBuilder();
       for(i=0;i<ls.size();i++){
           s.append(ls.get(i));
       }
       return s.toString();
    }
}