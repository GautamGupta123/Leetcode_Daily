class Solution {
    public String invert(String ans){
        int i;
        char arr[]=ans.toCharArray();
        for(i=0;i<arr.length;i++){
            if(arr[i]=='0'){
                arr[i]='1';
            }
            else{
                arr[i]='0';
            }
        }
        StringBuilder sb=new StringBuilder();
        for(i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
    public String reverse(String ans){
        int i=0;
        int j=ans.length()-1;
        char arr[]=ans.toCharArray();
        while(i<=j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        StringBuilder sb=new StringBuilder();
        for(i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
    public char findKthBit(int n, int k) {
        int i,j;
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        String ans="0";
        for(i=2;i<=n;i++){
                sb.append(ans);
                sb.append("1");
                sb1.append(sb);
                sb1.append(reverse(invert(ans)));
                ans=sb1.toString();
                sb.setLength(0);
                sb1.setLength(0);
        }
        return ans.charAt(k-1);
    }
}