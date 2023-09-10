class Solution {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node moveToFront(Node head) {
        // code here
        if(head==null || head.next==null){
            return head;
        }
        Node temp=head;
        Node t=null;
        while(temp.next!=null){
            t=temp;
            temp=temp.next;
        }
        temp.next=head;
        t.next=null;
        head=temp;
        return head;
    }
}