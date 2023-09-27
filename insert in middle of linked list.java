class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Solution {
    
    public Node insertInMid(Node head, int data){
       Node newnode=new Node(data);
       int c=0;
       Node cnt=head;
       while(cnt!=null){
           c++;
           cnt=cnt.next;
       }
       if(c%2!=0){
           Node c1=head;
           int odd=(c+1)/2;
           while(odd!=1){
               c1=c1.next;
               odd--;
           }
               newnode.next=c1.next;
               c1.next=newnode;
            //   break;
          }
         else if(c%2==0){
             Node c1=head;
             int even=c/2;
             while(even!=1){
                 c1=c1.next;
                 even--;
             }
             newnode.next=c1.next;
             c1.next=newnode;
            //  break;
         }
       return head;
    }
}