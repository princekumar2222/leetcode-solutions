// 9 ms | 46.4 MB

class MyLinkedList {

    Node head;
    int size;

    // Constructor
    public MyLinkedList() {
        head = null;
        size = 0;
    }

    // Get value at index
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.data;
    }

    // Add at head
    public void addAtHead(int val) {
        Node n = new Node(val);

        n.next = head;
        head = n;

        size++;
    }

    // Add at tail
    public void addAtTail(int val) {
        Node n = new Node(val);

        if (head == null) {
            head = n;
            size++;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = n;
        size++;
    }

    // Add at index
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node n = new Node(val);
        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        n.next = temp.next;
        temp.next = n;

        size++;
    }

    // Delete at index
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }

        if (index == 0) {
            head = head.next;
            size--;
            return;
        }

        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        size--;
    }

    // Traverse
    public void traverse() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

// Node class
class Node {
    int data;
    Node next;

    public Node(int d) {
        data = d;
        next = null;
    }
}
