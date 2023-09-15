class Solution
{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
	public static Node sortedInsert(Node head,int data)
         {
            //add code here.
            Node newNode=new Node(data);
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            if(data<=head.data){
                newNode.next=head;
                temp.next=newNode;
                head=newNode;
                return head;
            }
            if(data>=temp.data){
                newNode.next=head;
                temp.next=newNode;
                newNode.data=data;
                return head;
            }
            Node temp1=head;
            Node prev=null;
            while(temp1.next!=head){
                if(data>temp1.data){
                    prev=temp1;
                    temp1=temp1.next;
                }
                else if(data<=temp1.data){
                    newNode.next=prev.next;
                    prev.next=newNode;
                    newNode.data=data;
                    break;
                }
            }
            return head;
         }
}