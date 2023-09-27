
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Solution {
    
    //Function to check whether two linked lists are identical or not.
    public boolean isIdentical (Node head1, Node head2){
        //write your code here 
        Node temp=head1;
        int c=0;
        int c1=0;
        Node temp1=head2;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        while(temp1!=null){
            c1++;
            temp1=temp1.next;
        }
        int flag=0;
        //System.out.print(c1);
        //System.out.print(c);
        
        if(c1>c || c>c1){
            return false;
        }
        else{
            temp=head1;
            temp1=head2;
            while(temp1!=null){
                if(temp.data==temp1.data){
                    flag++;
                }
                else{
                    return false;
                }
                temp1=temp1.next;
                    temp=temp.next;
            }
        }
        if(flag==c){
            return true;
        }
        return true;
    }
}