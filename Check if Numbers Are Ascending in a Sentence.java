class Solution {
    public int tointeger(String ans){
        int n=ans.length();
        int p=n-1;
        int i;
        int res=0;
        for(i=0;i<ans.length();i++){
            res+=Character.getNumericValue(ans.charAt(i))*(int)Math.pow(10,p);
            p--;
        }
        return res;
    }
    public boolean areNumbersAscending(String s) {
        // StringBuilder s1=new StringBuilder();
        int i;
        // String ans=s1.toString();
        StringBuilder s2=new StringBuilder();
        ArrayList<Integer>ls=new ArrayList<>();
        for(i=0;i<s.length()-1;i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                s2.append(s.charAt(i));
                if((s.charAt(i+1)>='a' && s.charAt(i+1)<='z') || (s.charAt(i+1)==' ')){
                    ls.add(tointeger(s2.toString()));
                    s2.setLength(0);
                }
            }
        }
        if(s.charAt(s.length()-1)>='0' && s.charAt(s.length()-1)<='9'){
            s2.append(s.charAt(s.length()-1));
            ls.add(tointeger(s2.toString()));
        }
        int flg=0;
        for(i=0;i<ls.size()-1;i++){
            if(ls.get(i)<ls.get(i+1)){
                flg++;
            }
        }
        if(flg==(ls.size()-1)){
            return true;
        }
        System.out.print(ls);
        return false;
    }
}