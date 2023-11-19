import java.util.*;
class GfG{
        public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node moveZeroes(Node head){
        Node temp=head;
        int c=0;
        while(temp!=null){
            if(temp.data==0){
                c++;
            }
            temp=temp.next;
        }
        ArrayList<Integer>ls=new ArrayList<Integer>(); 
        Node temp1=head;
        while(temp1!=null){
            if(temp1.data!=0){
                ls.add(temp1.data);
            }
            temp1=temp1.next;
        }
        Node temp2=head;
        while(c>0){
            temp2.data=0;
            c--;
            temp2=temp2.next;
        }
        int i=0;
        Node pp=temp2;
        while(pp!=null){
            pp.data=ls.get(i);
            i++;
            pp=pp.next;
        }
        return head;
    }
}