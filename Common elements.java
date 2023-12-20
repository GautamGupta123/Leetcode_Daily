class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        ArrayList<Integer>ls=new ArrayList<>();
        int i;
        HashSet<Integer>hs=new HashSet<Integer>();
        for(i=0;i<=n1-1;i++) hs.add(A[i]);
        HashSet<Integer>hs1=new HashSet<Integer>();
        for(i=0;i<=n2-1;i++) hs1.add(B[i]);
        HashSet<Integer>hs2=new HashSet<Integer>();
        for(i=0;i<=n3-1;i++) hs2.add(C[i]);
        
        ArrayList<Integer>ls1=new ArrayList<Integer>(hs);
        ArrayList<Integer>ls2=new ArrayList<Integer>(hs1);
        ArrayList<Integer>ls3=new ArrayList<Integer>(hs2);
        
         HashMap<Integer,Integer>hm=new HashMap<>();
         for(i=0;i<=ls1.size()-1;i++){
             hm.put(ls1.get(i),hm.getOrDefault(ls1.get(i),0)+1);
         }
         for(i=0;i<=ls2.size()-1;i++){
             hm.put(ls2.get(i),hm.getOrDefault(ls2.get(i),0)+1);
         }
         for(i=0;i<=ls3.size()-1;i++){
             hm.put(ls3.get(i),hm.getOrDefault(ls3.get(i),0)+1);
         }
         for(Map.Entry m1:hm.entrySet()){
             if((int)m1.getValue()==3){
                 ls.add((int)m1.getKey());
             }
         }
         Collections.sort(ls);
         if(ls.size()==0){
             ls.add(-1);
         }
         return ls;
    }
}