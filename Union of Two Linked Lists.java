/*
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
	    HashSet<Integer>hs=new HashSet<Integer>();
	    Node temp=head1;
	    int c=0;
	    int i;
	    while(temp!=null){
	        c++;
	        temp=temp.next;
	    }
	    temp=head1;
	    while(temp.next!=null){
	        temp=temp.next;
	    }
	    temp.next=head2;
	    Node t=head1;
	    while(t!=null){
	        hs.add(t.data);
	        t=t.next;
	    }
	    ArrayList<Integer>ls=new ArrayList<Integer>(hs);
	    Collections.sort(ls);
	    Node t1=null;
	    t=head1;
	    for(i=0;i<=ls.size()-1;i++){
	        t1=t;
	        t.data=ls.get(i);
	        t=t.next;
	    }
	    t1.next=null;
	    return head1;
	}
}