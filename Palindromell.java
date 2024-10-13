package LinkedListDataStructure;

class Node111
{
    int data;
    Node111 next;

Node111(int data)
{
    this.data=data;
    this.next=null;
}
public void setNext(Node111 nextNode)
{
    this.next=nextNode;
}
public void printlst(Node111 head)
{
    while (head!=null)
    {
        System.out.print(head.data+"=>");
        head=head.next;
    }
    System.out.println("NULL");
}
public boolean ispalindrome(Node111 head)
{
    Node111 slow=head;
    Node111 fast=head;

    while (fast!=null && fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
    }
    Node111 pre=null;
    Node111 curr=slow;

    while (curr!=null)
    {
        Node111 temp=curr.next;
        curr.next=pre;
        pre=curr;
        curr=temp;
    }
    while (pre!=null)
    {
        if(head.data!= pre.data)
            return false;
        head=head.next;
        pre=pre.next;

    }
    return true;

}

}

public class Palindromell {

    public static void main(String[] args) {

        Node111 n1=new Node111(1);
        Node111 n2=new Node111(2);
        Node111 n3=new Node111(3);
        Node111 n6=new Node111(3);
        Node111 n4=new Node111(2);
        Node111 n5=new Node111(1);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n6);
        n6.setNext(n4);
        n4.setNext(n5);

        n1.printlst(n1);
        System.out.println(n1.ispalindrome(n1));

    }
}
