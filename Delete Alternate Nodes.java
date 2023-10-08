class Solution {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void deleteAlternate (Node head){
        //Write your code here
        Node temp=head;
        Node temp1=head;
        while(temp1.next!=null){
            if(temp1.next.next==null){
                temp1.next=null;
                break;
            }
            temp1=temp.next.next;
            temp.next=temp.next.next;
            temp=temp1;
        }
    }
}