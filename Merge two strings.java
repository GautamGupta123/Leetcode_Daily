class Solution 
{ 
    String merge(String S1, String S2)
    { 
        StringBuilder s=new StringBuilder();
        int i;
        String str="";
        if(S1.length()>S2.length()){
            for(i=0;i<=S2.length()-1;i++){
                s.append(S1.charAt(i));
                s.append(S2.charAt(i));
            }
            for(i=S2.length();i<=S1.length()-1;i++){
                s.append(S1.charAt(i));
            }
             str=s.toString();
            return str;
        }
        else if(S1.length()<S2.length()){
            for(i=0;i<=S1.length()-1;i++){
                s.append(S1.charAt(i));
                s.append(S2.charAt(i));
            }
            for(i=S1.length();i<=S2.length()-1;i++){
                s.append(S2.charAt(i));
            }
             str=s.toString();
            return str;
        }
        else if(S1.length()==S2.length()){
            for(i=0;i<=S2.length()-1;i++){
                s.append(S1.charAt(i));
                s.append(S2.charAt(i));
            }
             str=s.toString();
        }
        return str;
    }
} 