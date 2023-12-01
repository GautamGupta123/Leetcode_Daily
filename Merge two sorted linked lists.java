/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/
class LinkedList
{
    Node sortedMerge(Node head1, Node head2) {
       int c=0;
       int c1=0;
       int i;
       Node temp=head1;
       while(temp.next!=null){
           c++;
           temp=temp.next;
       }
       temp.next=head2;
       Node temp1=head1;
       while(temp1!=null){
           c1++;
           temp1=temp1.next;
       }
       int ans[]=new int[c1];
       temp1=head1;
       for(i=0;i<=c1-1;i++){
           ans[i]=temp1.data;
           temp1=temp1.next;
       }
       Arrays.sort(ans);
       temp1=head1;
       for(i=0;i<=c1-1;i++){
           temp1.data=ans[i];
           temp1=temp1.next;
       }
       return head1;
   } 
}
