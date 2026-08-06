package LinkedList;

public class middleLL {
    static void main() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        printList(head);

        // Find middle node
        ListNode middle = middlenode(head);
        System.out.println("Middle Node: " + middle.val);


    }
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static ListNode middlenode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast !=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);

            if (head.next != null)
                System.out.print(" -> ");

            head = head.next;
        }

        System.out.println();
    }
}
