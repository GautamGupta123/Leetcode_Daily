class Solution {
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    int height(Node node) 
    { 
        if(node==null){
            return 0;
        }
        int lh=height(node.left);
        int rh=height(node.right);
        int h=Math.max(lh,rh)+1;
        return h;
    }
}