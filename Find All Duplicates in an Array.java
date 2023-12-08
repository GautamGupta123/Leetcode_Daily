class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        ArrayList<Integer>ls=new ArrayList<Integer>();
        int i;
        for(i=0;i<=nums.length-1;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
         for(Map.Entry m : hm.entrySet()){    
            if(m.getValue().equals(2)){
                ls.add((int)m.getKey());
              }   
            }  
        return ls;
    }
}