import java.util.*;
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer>ls=new ArrayList<Integer>();
        int i;
        Arrays.sort(arr1);
        for(i=0;i<=arr1.length-1;i++){
            ls.add(arr1[i]);
        }
        HashSet<Integer>ls1=new HashSet<Integer>();
        for(i=0;i<=arr2.length-1;i++){
            ls1.add(arr2[i]);
        }
        ArrayList<Integer>ans=new ArrayList<>();
        int j;
        for(i=0;i<=arr2.length-1;i++){
            for(j=0;j<=arr1.length-1;j++){
                if(arr1[j]==arr2[i]){
                    ans.add(arr1[j]);
                }
            }
        }
        for(i=0;i<=arr1.length-1;i++){
            if(!ls1.contains(arr1[i])){
                ans.add(arr1[i]);
            }
        }
        int ans1[]=new int[ans.size()];
        for(i=0;i<=ans.size()-1;i++){
            ans1[i]=ans.get(i);
        }
        return ans1;
    }
}