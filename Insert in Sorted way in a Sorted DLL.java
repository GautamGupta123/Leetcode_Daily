class GfG
{
    public static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node sortedInsert(Node head, int x)
    {
        Node temp=head.next;
        Node newNode=new Node(x);
        if(x<=head.data){
            newNode.next=head;
            newNode.prev=null;
            newNode.data=x;
            head.prev=newNode;
            head=newNode;
            return head;
        }
         temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        if(x>=temp.data){
            newNode.next=null;
            newNode.prev=temp;
            temp.next=newNode;
            newNode.data=x;
            return head;
        }
            Node temp1=head.next;
            Node newNode1=new Node(x);
            while(temp1!=null){
                if(x>=temp1.prev.data && x<=temp1.data){
                    newNode1.next=temp1;
                    newNode1.prev=temp1.prev;
                    newNode1.data=x;
                    newNode1.prev.next=newNode1;
                    temp1.prev=newNode1;
                    break;
                }
                temp1=temp1.next;
            }
        return head;
    }
}