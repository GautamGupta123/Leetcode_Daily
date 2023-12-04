class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>>ls=new ArrayList<>();
        int i;
        ArrayList<Integer>l1=new ArrayList<Integer>();
        ArrayList<Integer>l2=new ArrayList<Integer>();
        for(i=0;i<=nums1.length-1;i++){
            l1.add(nums1[i]);
        }
        for(i=0;i<=nums2.length-1;i++){
            l2.add(nums2[i]);
        }
        ArrayList<Integer>ans=new ArrayList<Integer>();
        for(i=0;i<=nums1.length-1;i++){
            if(!l2.contains(nums1[i])){
                ans.add(nums1[i]);
            }
        }
        HashSet<Integer>hs=new HashSet<Integer>(ans);
        ArrayList<Integer>ans2=new ArrayList<Integer>(hs);
        ArrayList<Integer>ans1=new ArrayList<Integer>();
        for(i=0;i<=nums2.length-1;i++){
            if(!l1.contains(nums2[i])){
                ans1.add(nums2[i]);
            }
        }
        HashSet<Integer>hs1=new HashSet<Integer>(ans1);
        ArrayList<Integer>ans3=new ArrayList<Integer>(hs1);
        ls.add(ans2);
        ls.add(ans3);
        return ls;
    }
}