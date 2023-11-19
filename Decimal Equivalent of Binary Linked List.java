class gfg
{
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
   long DecimalValue(Node head)
   {
 	  long d=0;
 	  Node temp=head;
 	  long c=0;
 	  Node temp1=head;
 	  while(temp1!=null){
 	      c++;
 	      temp1=temp1.next;
 	  }
 	  long p=c-1;
 	  while(temp!=null){
 	      d+=(temp.data*Math.pow(2,p)%(1000000007));
 	      p--;
 	      temp=temp.next;
 	  }
 	  long ans=d%(1000000007);
 	  return ans;
   }
}