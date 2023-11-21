import java.util.*;
class Solution {
    public static class TreeNode{
        int val;
        TreeNode left,right;
        TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    } 
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer>ls=new ArrayList<Integer>();
        if(root==null){
            return new ArrayList<Integer>();
        }
        ls.add(root.val);
        ls.addAll(preorderTraversal(root.left));
        ls.addAll(preorderTraversal(root.right));
        return ls;
    }
}