class Solution {
    public String customSortString(String order, String s) {
        ArrayList<Character>ls=new ArrayList<>();
        int i,j;
        for(i=0;i<s.length();i++){
            ls.add(s.charAt(i));
        }
        ArrayList<Character>ans=new ArrayList<>();
        Collections.sort(ls);
        for(i=0;i<order.length();i++){
            for(j=0;j<ls.size();j++){
                if(order.charAt(i)==ls.get(j)){
                    ans.add(ls.get(j));
                }
            }
        }
        ArrayList<Character>res=new ArrayList<>();
        for(i=0;i<order.length();i++){
            res.add(order.charAt(i));
        }
        for(i=0;i<ls.size();i++){
            if(!res.contains(ls.get(i))){
                ans.add(ls.get(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        for(i=0;i<ans.size();i++){
            sb.append(ans.get(i));
        }
        return sb.toString();
    }
}