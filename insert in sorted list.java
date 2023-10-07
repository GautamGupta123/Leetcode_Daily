class Solution {
    public static class Node{
    int data;
    Node next;
    Node(int key){
        data =key ;
        this.next=null;
    }
}
    Node sortedInsert(Node head1, int key) {
       Node newNode =new Node(key);
       Node temp1=head1;
       int c=0;
       if(head1==null){
           return head1;
       }
       while(temp1!=null){
           c++;
           temp1=temp1.next;
       }
       if(c==1){
       if(key<=head1.data){
           newNode.next=head1;
           newNode.data=key;
           head1=newNode;
           return head1;
       }
       else if(key>head1.data){
           newNode.next=null;
           head1.next=newNode;
           newNode.data=key;
           return head1;
       }
      }
       Node temp=head1;
       while(temp!=null){
           if(key<=head1.data){
               newNode.next=head1;
               head1=newNode;
               newNode.data=key;
               break;
           }
          if(key>temp.data && temp.next==null){
              newNode.next=null;
              temp.next=newNode;
              newNode.data=key;
              break;
          }
          if(temp.data<key && temp.next.data>=key){
              newNode.data=key;
              newNode.next=temp.next;
              temp.next=newNode;
              break;
          }
          temp=temp.next;
       }
       return head1;
    }
}