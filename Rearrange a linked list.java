class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
class Solution
{

   // Should rearrange given linked list such that all even
   // positioned Nodes are before odd positioned.
   // Returns nothing
    void rearrangeEvenOdd(Node head)
    {
          int i=1;
          Node temp=head;
          int c=0;
          while(temp!=null){
              c++;
              temp=temp.next;
          }
          int ans[]=new int[c];
          temp=head;
          int j=0;
          while(temp!=null && i<=c){
              if(i%2!=0){
                  ans[j]=temp.data;
                  j++;
              }
              i++;
              temp=temp.next;
          }
          temp=head;
          i=1;
           while(temp!=null && i<=c){
              if(i%2==0){
                  ans[j]=temp.data;
                  j++;
              }
              i++;
              temp=temp.next;
          }
          temp=head;
          i=0;
          while(temp!=null){
              temp.data=ans[i];
              temp=temp.next;
              i++;
          }
     }
}