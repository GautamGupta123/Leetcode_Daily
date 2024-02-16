class Solution {
    public String convert(String str){
        int i;
        StringBuilder s=new StringBuilder();
        char arr[]=str.toCharArray();
        for(i=0;i<arr.length;i++){
            if(i==0 && arr[0]>='a' && arr[0]<='z'){
                arr[0]=(char)((int)arr[0]-32-0);
            }
            else if(i!=0 && arr[i]>='A' && arr[i]<='Z'){
                arr[i]=(char)((int)arr[i]+32-0);
            }
        }
        for(i=0;i<arr.length;i++){
            s.append(arr[i]);
        }
        return s.toString();
    }
    public String capitalizeTitle(String title) {
        ArrayList<String>ls=new ArrayList<>();
        int i;
        StringBuilder s=new StringBuilder();
        for(i=0;i<title.length()-1;i++){
            if(title.charAt(i)==' ') continue;
            s.append(title.charAt(i));
            if(title.charAt(i+1)==' '){
                ls.add(s.toString());
                ls.add(" ");
                s.setLength(0);
            }
        }
        for(i=title.length()-1;i<=title.length()-1;i++){
            s.append(title.charAt(i));
        }
        ls.add(s.toString());
        ArrayList<String>ls1=new ArrayList<>();
        for(i=0;i<ls.size();i++){
            if(ls.get(i).length()==1 || ls.get(i).length()==2){
                ls1.add(ls.get(i).toLowerCase());
            }
            else if(ls.get(i).length()>2){
                ls1.add(convert(ls.get(i)));
            }
        }
        s.setLength(0);
        for(i=0;i<ls1.size();i++){
            if(i==ls1.size()-1){
                s.append(ls1.get(i));
            }
            else {
                 s.append(ls1.get(i));
            }
        }
        return s.toString();
    }
}