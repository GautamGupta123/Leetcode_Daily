class Solution {
    public int calPoints(String[] op) {
        int i;
        int score=0;
        ArrayList<Integer>ans=new ArrayList<>();
        int n=op.length;
        for(i=0;i<n;i++){
            if(op[i].equals("C")){
                ans.remove(ans.size()-1);
            }
            else if(op[i].equals("D")){
                int t=ans.get(ans.size()-1)*2;
                ans.add(t);
            }
            else if(op[i].equals("+")){
                if(ans.size()>=2){
                     int p=ans.get(ans.size()-1)+ans.get(ans.size()-2);
                     ans.add(p);
                } 
            }
            else{
                ans.add(Integer.valueOf(op[i]));
            }
        }
        int sum=0;
        for(i=0;i<ans.size();i++){
            sum+=ans.get(i);
        }
        return sum;
    }
}