import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i;
        HashSet<Integer>hs=new HashSet<Integer>();
        HashSet<Integer>hs1=new HashSet<Integer>();
        for(i=0;i<=nums1.length-1;i++){
            hs.add(nums1[i]);
        }
        for(i=0;i<=nums2.length-1;i++){
            hs1.add(nums2[i]);
        }
        int ans[]=new int[hs1.size()];
        ArrayList<Integer>ls=new ArrayList<Integer>(hs1);
        for(i=0;i<=ans.length-1;i++){
            ans[i]=ls.get(i);
        }
        ArrayList<Integer>ans1=new ArrayList<Integer>();
        for(i=0;i<=ls.size()-1;i++){
            if(hs.contains(ans[i])){
                ans1.add(ans[i]);
            }
        }
        int ans2[]=new int[ans1.size()];
        for(i=0;i<=ans2.length-1;i++){
            ans2[i]=ans1.get(i);
        }
        return ans2;
    }
}