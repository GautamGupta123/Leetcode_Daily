class GfG
{
    public static class Node{
              int data;
              Node next;
              Node(int data){
                this.data=data;
                this.next=null;
              }
    }
    Node delete(Node head, int k)
    {
	  Node temp=head;
	  if(k==1){
	      head=null;
	      return head;
	  }
	  if(head.next==null && k==1){
	      head=null;
	      return head;
	  }
	  if(head.next==null && k>1){
	      return head;
	  }
	  Node prev=head;
	  Node prev1=null;
	  Node next1=null;
	  int c=1;
	  while(temp!=null){
	      c=1;
	      while(prev!=null){
	          if(c==k){
	              next1=prev.next;
	              prev1.next=prev.next;
	              prev=next1;
                  break;
	          }
	          prev1=prev;
	          prev=prev.next;
	          c++;
	      }
	      temp=temp.next;
	  }
	  return head;
    }
}