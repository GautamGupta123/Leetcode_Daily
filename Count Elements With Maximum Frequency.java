class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int i;
        for(i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int max=Integer.MIN_VALUE;
        for(Map.Entry m1:hm.entrySet()){
            if((int)m1.getValue()>max){
                max=(int)m1.getValue();
            }
        }
        int sum=0;
        for(Map.Entry m1:hm.entrySet()){
            if((int)m1.getValue()==max){
                sum+=(int)m1.getValue();
            }
        }
        return sum;
    }
}