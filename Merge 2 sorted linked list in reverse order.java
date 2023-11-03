class GfG
{
    static class Node{
        int data;
        Node next;
        Node(int data){
           this.data=data;
           this.next=null;
        }
    }
    Node mergeResult(Node node1, Node node2)
    {
	    Node temp=node1;
	    while(temp.next!=null){
	        temp=temp.next;
	    }
	    temp.next=node2;
	    Node temp1=node1;
	    Node temp2=node1.next;
	    int t;
	    while(temp1.next!=null){
	        temp2=temp1.next;
	        while(temp2!=null){
	            if(temp1.data<temp2.data){
	                t=temp1.data;
	                temp1.data=temp2.data;
	                temp2.data=t;
	            }
	            temp2=temp2.next;
	        }
	        temp1=temp1.next;
	    }
	    return node1;
    }
}