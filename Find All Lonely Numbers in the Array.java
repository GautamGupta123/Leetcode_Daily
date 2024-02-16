class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int i;
        for(i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        HashSet<Integer>hs=new HashSet<>();
        for(Map.Entry h1:hm.entrySet()){
            if((int)h1.getValue()==1){
                hs.add((int)h1.getKey());
            }
        }
        HashSet<Integer>hs1=new HashSet<>();
        for(i=0;i<nums.length;i++){
            hs1.add(nums[i]);
        }
        ArrayList<Integer>ls=new ArrayList<>(hs);
        ArrayList<Integer>ls1=new ArrayList<>();
        for(i=0;i<ls.size();i++){
            if(!hs1.contains(ls.get(i)+1) && !hs1.contains(ls.get(i)-1)){
                ls1.add(ls.get(i));
            }
        }
        return ls1;
    }
}