class Solution{
    int findFrequency(int A[], int x){
        HashMap<Integer,Integer>hm=new HashMap<>();
        int i;
        for(i=0;i<=A.length-1;i++){
            hm.put(A[i],hm.getOrDefault(A[i],0)+1);
        }
        int ans=0;
        for(Map.Entry m:hm.entrySet()){
            if(m.getKey().equals(x)){
                ans=(int)m.getValue();
                break;
            }
        }
        return ans;
    }
}