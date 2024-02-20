class Solution{
    boolean isSubSequence(String A, String B){
        ArrayList<Integer>ls=new ArrayList<Integer>();
        int i=0;
        int j=0;
        int n=A.length();
        int m=B.length();
        while(i<n && j<m){
            if(A.charAt(i)==B.charAt(j)){
                ls.add(j);
                i++;
                j++;
            }
            else if(A.charAt(i)!=B.charAt(j)){
                j++;
            }
        }
        int cnt=0;
        if(ls.size()<A.length()) return false;
        for(i=0;i<ls.size()-1;i++){
            if(ls.get(i)<ls.get(i+1)) cnt++;
        }
        if(cnt==(ls.size()-1)) return true;
        return false;
    }
}