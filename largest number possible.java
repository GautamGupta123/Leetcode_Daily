class Solution{
    static String findLargest(int N, int S){
        // code here
        StringBuilder ans=new StringBuilder();
        int i;
        if(S==0 && N>1){
            return "-1";
        }
        for(i=0;i<N;i++){
            if(S>=9){
                ans.append('9');
                S=S-9;
            }
            else{
                ans.append((char)(S+48));
                S=0;
            }
        }
        if(S>0){
            return "-1";
        }
        return ans.toString();
    }
}