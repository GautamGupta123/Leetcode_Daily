class Solution{
    int DivisibleByEight(String s){
        if(s.length()<3){
            int p=s.length()-1;
            int d=0;
            for(int i=0;i<s.length();i++){
                d+=Character.getNumericValue(s.charAt(i))*(int)Math.pow(10,p);
                p--;
            }
            if(d%8==0) return 1;
        }
        else{
            StringBuilder sb=new StringBuilder();
            int g=3;
            int i=s.length()-1;
            while(g!=0){
                sb.append(s.charAt(i));
                i--;
                g--;
            }
            String str=sb.reverse().toString();
            int p=str.length()-1;
            int d=0;
            for(int j=0;j<str.length();j++){
                d+=Character.getNumericValue(str.charAt(j))*(int)Math.pow(10,p);
                p--;
            }
            if(d%8==0) return 1;
        }
        return -1;
    }
}