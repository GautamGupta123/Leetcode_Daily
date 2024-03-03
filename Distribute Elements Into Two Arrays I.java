class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer>ls=new ArrayList<>();
        ArrayList<Integer>ls1=new ArrayList<>();
        int i=2;
        ls.add(nums[0]);
        ls1.add(nums[1]);
        int j=ls.size()-1;
        int k=ls1.size()-1;
        while(i<nums.length){
            if(ls.get(j)>ls1.get(k)){
                ls.add(nums[i]);
                j=ls.size()-1;
            }
            else{
               ls1.add(nums[i]);
               k=ls1.size()-1;
            }
            i++;
        }
        ArrayList<Integer>res=new ArrayList<>();
        for(i=0;i<ls.size();i++){
            res.add(ls.get(i));
        }
        for(i=0;i<ls1.size();i++){
            res.add(ls1.get(i));
        }
        for(i=0;i<nums.length;i++){
            nums[i]=res.get(i);
        }
        return nums;
    }
}