class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n=tokens.length;
        int i=0;
        int j=n-1;
        int sc=0;
        Arrays.sort(tokens);
        while(i<=j){
            if(i==j){
                if(power>=tokens[i]){
                     sc++;
                     power-=tokens[i];
                     i++;
                }
                else{
                    break;
                }
            }
            else if(power>=tokens[i]){
                sc++;
                power-=tokens[i];
                i++;
            }
            else if(power<tokens[i] && sc>=1){
                power+=tokens[j];
                sc--;
                j--;
            }
            else if(power<tokens[i] && sc<1){
               i++;
            }
        }
        return sc;
    }
}