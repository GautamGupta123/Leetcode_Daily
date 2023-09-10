class solution{
     public static class Node{
        int data;
        Node next,prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
public static Node reverseDLL(Node  head)
{
    //Your code here
    Node i;
    Node j=head;
    i=head;
    int temp;
    Node cnt=head;
    int c=0;
    while(cnt!=null){
        c++;
        cnt=cnt.next;
    }
    while(j.next!=null){
        j=j.next;
    }
    if(c%2!=0){
    while(i!=j){
        temp=i.data;
        i.data=j.data;
        j.data=temp;
        i=i.next;
        j=j.prev;
     }
    }
    else if(c%2==0){
      while(i.prev!=j){
        temp=i.data;
        i.data=j.data;
        j.data=temp;
        i=i.next;
        j=j.prev;
    }
    }
    return head;
 }
}