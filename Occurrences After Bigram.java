class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        ArrayList<String>ls=new ArrayList<>();
        int i;
        StringBuilder s=new StringBuilder();
        for(i=0;i<text.length();i++){
            if(text.charAt(i)==' ' || i==text.length()-1){
                if(i==text.length()-1){
                    s.append(text.charAt(text.length()-1));
                    ls.add(s.toString());
                    s.setLength(0);
                }
                else{
                    ls.add(s.toString());
                    s.setLength(0);
                }
            }
            else s.append(text.charAt(i));
        }
        ArrayList<String>ans=new ArrayList<>();
        for(i=0;i<ls.size()-2;i++){
            if(first.equals(ls.get(i)) && second.equals(ls.get(i+1))){
                ans.add(ls.get(i+2));
            }
        }
        String ans1[]=new String[ans.size()];
        for(i=0;i<ans1.length;i++){
            ans1[i]=ans.get(i);
        }
        return ans1;
    }
}