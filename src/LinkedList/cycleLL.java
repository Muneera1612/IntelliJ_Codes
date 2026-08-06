package LinkedList;

public class cycleLL {
    static void main() {
        ListNode ls=new ListNode(1);
        ls.next = new ListNode(2);
        ls.next.next = new ListNode(3);
        ls.next.next.next = new ListNode(4);
        ls.next.next.next.next = new ListNode(5);

        // Create a cycle
        // 5 points back to node 3
        ls.next.next.next.next.next = ls.next.next;

        boolean result = hascycle(ls);

        System.out.println("Cycle Present: " + result);

    }
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static boolean  hascycle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow =slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
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
