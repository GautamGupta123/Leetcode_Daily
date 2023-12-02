class Node
{
   int data;
   Node next;
   Node(int d) {data = d; next = null; }
 }
class Solution
{
	Node sortList(Node head) {
	    Node temp=head;
	    int c=0;
	    while(temp!=null){
	        c++;
	        temp=temp.next;
	    }
	    int ans[]=new int[c];
	    temp=head;
	    int i=0;
	    while(temp!=null){
	        ans[i]=temp.data;
	        i++;
	        temp=temp.next;
	    }
	    Arrays.sort(ans);
	    temp=head;
	    for(i=0;i<=c-1;i++){
	        temp.data=ans[i];
	        temp=temp.next;
	    }
	    return head;
	}
}