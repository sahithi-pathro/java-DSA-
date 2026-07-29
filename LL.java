class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LL{
    private Node head;
    public void insertAtBegin(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    public void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.print("null");
    }
    public static void main (String[] args) {
        LL li=new LL();
        li.insertAtBegin(15);
        li.insertAtBegin(10);
        li.insertAtBegin(5);
        li.insertAtEnd(20);
        li.insertAtEnd(30);
        li.display();
    }
}