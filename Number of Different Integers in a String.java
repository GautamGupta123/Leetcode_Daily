class Solution {
    public int tointeger(String str){
        if(str.length()==0) return -1;
        int n=str.length();
        int p=n-1;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Character.getNumericValue(str.charAt(i))*(int)Math.pow(10,p);
            p--;
        }
        return sum;
    }
    public int numDifferentIntegers(String word) {
        int n=word.length();
        HashSet<Integer>hs=new HashSet<>();
        StringBuilder s=new StringBuilder();
        for(int i=0;i<n;i++){
            if(word.charAt(i)>='0' && word.charAt(i)<='9'){
                s.append(word.charAt(i));
            }
             if((word.charAt(i)>='a' && (word.charAt(i))<='z') || i==(n-1)){
                int t=tointeger(s.toString());
                if(t==-1){
                    continue;
                }
                else{
                hs.add(t);
                s.setLength(0);
                }
            }
        }
        return hs.size();
    }
}