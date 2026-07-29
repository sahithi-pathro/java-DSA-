class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
public class DLL {
    private Node head;
    
    // Insert at the beginning
    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }
    
    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    // Display forward
    public void displayForward() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    // Display backward
    public void displayBackward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;

        // Move to the last node
        while (current.next != null) {
            current = current.next;
        }

        // Traverse backward
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertAtBegin(15);
        list.insertAtBegin(10);
        list.insertAtBegin(5);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        System.out.println("Forward Traversal:");
        list.displayForward();
        System.out.println("Backward Traversal:");
        list.displayBackward();
    }
}
