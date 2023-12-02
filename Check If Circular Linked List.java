class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
class GfG
{
    boolean isCircular(Node head)
    {
	  if(head==null){
	      return true;
	  }
	  if(head.next==head){
	      return true;
	  }
	  Node temp=head;
	  int flg=0;
	  while(temp!=null){
	      if(temp.next==head){
	          flg++;
	          break;
	      }
	      temp=temp.next;
	  }
	  if(flg!=0){
	      return true;
	  }
	  return false;
    }
}