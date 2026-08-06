package LinkedList;

public class removeNthnode {
    static void main() {
        ListNode rl = new ListNode(9);
        rl.next = new ListNode(1);
        rl.next.next = new ListNode(2);
        rl.next.next.next = new ListNode(3);
        rl.next.next.next.next = new ListNode(4);
        System.out.println("Original List:");
//        printList(head);
//
//        // Create object
//        removeNthnode obj = new removeNthnode();
//
//        // Remove 5th node from the end
//        ListNode result = obj.removeNthNode(head, 5);
//
//        System.out.println("After Removing:");
//        printList(result);
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        public ListNode removeNthNode(ListNode head, int n) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode fast = dummy;
            ListNode slow = dummy;
            for (int i = 0; i <= n; i++) {
                fast = fast.next;
            }
            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;
            return dummy.next;
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
}