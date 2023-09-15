class Solution {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node sortedInsert(Node head1, int key) {
        Node newNode=new Node(key);
        if(head1==null){
            head1=newNode;
            newNode.next=null;
            newNode.data=key;
            return head1;
        }
        if(key<=head1.data){
            newNode.next=head1;
            newNode.data=key;
            head1=newNode;
            return head1;
        }
        Node temp=head1;
        while(temp.next!=null){
            temp=temp.next;
        }
       if(key>=temp.data)
       {
           temp.next=newNode;
           newNode.next=null;
           newNode.data=key;
           return head1;
       }
       Node temp1=head1;
       Node prev=null;
       while(temp1!=null){
           if(temp1.data<key){
               prev=temp1;
                temp1=temp1.next;
           }
           else{
               newNode.next=prev.next;
               newNode.data=key;
               prev.next=newNode;
               break;
           }
       }
       return head1;
    }
}