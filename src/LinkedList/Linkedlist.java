package LinkedList;
class Linkedlist {
    Node head;
    Node tail;
    int size;

    private class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    // Insert at first
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }
    // Insert at last
    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    // Insert at a given index
    public void insertIndex(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val + "_ ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    static void main() {
        Linkedlist ll=new Linkedlist();
        ll.insertFirst(4);
        ll.insertLast(7);
        ll.insertIndex(8,4);
        ll.display();
    }
}