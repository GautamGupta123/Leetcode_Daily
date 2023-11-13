class Solution {
    String firstAlphabet(String S) {
        StringBuilder s=new StringBuilder();
        int i;
        int flag=0;
        char arr[]=S.toCharArray();
         for(i=0;i<=S.length()-1;i++){
            if(arr[i]!=' '){
                flag++;
            }
        }
        if(flag==1){
            s.append(arr[0]);
            return s.toString();
        }
        s.append(arr[0]);
        for(i=0;i<S.length()-1;i++){
            if(arr[i]==' ' && arr[i+1]!=' '){
                s.append(arr[i+1]);
            }
        }
        return s.toString();
    }
};