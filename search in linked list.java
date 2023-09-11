class Solution {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.next=null;
            this.data=data;
        }
    }
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
}