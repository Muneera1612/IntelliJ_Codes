package LinkedList;

public class merge2LL {
    void main() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
        // Second Linked List
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);
        System.out.println("First List:");
        printList(l1);

        System.out.println("Second List:");
        printList(l2);
        ListNode result = merge2list(l1, l2);
        System.out.println("Merged List:");
        printList(result);


    }
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public ListNode merge2list(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(l1!=null && l2!=null){
            if(l1.val < l2.val){
                temp.next=l1;
                l1=l1.next;
            }
            else{
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next;
        }
        if (l1 != null) {
            temp.next=l1;
        }
        if(l2!=null){
            temp.next=l2;
        }
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
