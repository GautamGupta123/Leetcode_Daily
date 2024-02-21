class Solution {
    public String sortSentence(String s) {
        int i;
        ArrayList<String>ls=new ArrayList<>();
        ArrayList<Integer>ls1=new ArrayList<>();
        StringBuilder s1=new StringBuilder();
        for(i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z')){
                  s1.append(s.charAt(i));
             }
            if(i==s.length()-1){
                ls1.add(Character.getNumericValue(s.charAt(i)));
                ls.add(s1.toString());
            }
            if(s.charAt(i)==' '){
                ls1.add(Character.getNumericValue(s.charAt(i-1)));
                ls.add(s1.toString());
                s1.setLength(0);
                ls.add(" ");
            }
        }
        int cnt=0;
        for(i=0;i<ls.size();i++){
            if(ls.get(i)==" ") cnt++;
        }
        int j=0;
        String ans[]=new String[ls.size()-cnt];
        for(i=0;i<ls.size();i++){
            if(ls.get(i)!=" "){
               ans[ls1.get(j)-1]=ls.get(i);
                j++;
            }
        }
        StringBuilder s2=new StringBuilder();
        for(i=0;i<ans.length;i++){
            if(i==ans.length-1){
                s2.append(ans[i]);
            }
            else{
             s2.append(ans[i]);
             s2.append(" ");
            }
        }
        return s2.toString();
    }
}