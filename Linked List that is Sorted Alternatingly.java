class Solution {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
   public Node sort(Node head){
        //your code here, return the head of the sorted list
        Node temp=head;
        Node temp1;
        int temp2;
        while(temp.next!=null){
            temp1=temp.next;
            while(temp1!=null){
                if(temp.data>temp1.data){
                temp2=temp1.data;
                temp1.data=temp.data;
                temp.data=temp2;

                }
               temp1=temp1.next;
            }
            temp=temp.next;
        }
        return head;
   }


}