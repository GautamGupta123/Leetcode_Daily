class Solution {
    public String reverse(String str){
        int i=0;
        int j=str.length()-1;
        char temp;
        char arr[]=str.toCharArray();
        while(i<=j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        StringBuilder s=new StringBuilder();
        for(i=0;i<arr.length;i++){
            s.append(arr[i]);
        }
        return s.toString();
    }
    public String reverseWords(String s) {
        StringBuilder s1=new StringBuilder();
        ArrayList<String>ls=new ArrayList<>();
        int i;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)==' ' || i==(s.length()-1)){
                if(i==s.length()-1){
                    s1.append(s.charAt(s.length()-1));
                    ls.add(reverse(s1.toString()));
                    s1.setLength(0);
                }
                else{
                  ls.add(reverse(s1.toString()));
                  ls.add(" ");
                  s1.setLength(0);
                }
            }
            else{
                s1.append(s.charAt(i));
            }
        }
        StringBuilder s2=new StringBuilder();
        for(i=0;i<ls.size();i++){
            s2.append(ls.get(i));
        }
        return s2.toString();
    }
}