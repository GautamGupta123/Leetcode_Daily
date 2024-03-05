class Solution {
    public String sortVowels(String s) {
        ArrayList<Character>ls=new ArrayList<>();
        String ans="aeiou";
        int i;
        String ans1="AEIOU";
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E' || s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='o' || s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U'){
                ls.add(s.charAt(i));
            }
        }
        Collections.sort(ls);
        int j=0;
        char arr[]=s.toCharArray();
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E' || s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='o' || s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U'){
                arr[i]=ls.get(j);
                j++;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}