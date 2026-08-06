package LinkedList;

import java.util.List;

public class IntersectionLL {
    static void main() {
        ListNode ln=new ListNode(4);
        ln.next=new ListNode(1);
        ln.next.next=new ListNode(8);
        ln.next.next.next=new ListNode(4);
        ln.next.next.next.next=new ListNode(5);
        ListNode ln1=new ListNode(3);
        ln1.next=new ListNode(6);
        ln1.next.next=new ListNode(7);
        System.out.println("Original list1: ");
        printList(ln);
        System.out.println("Second list: ");
        printList(ln1);
        IntersectionLL obj=new IntersectionLL();
        ListNode result=obj.intersecNode(ln,ln1);
        if(result!=null){
            System.out.println("Intersection Node: " + result.val);
        }
        else{
            System.out.println("NO intersection");
        }

    }
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public ListNode intersecNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        while (a != null) {
            ListNode b = headB;
            while (b != null) {
                if (a.val==b.val) {
                    return a;
                }
                b = b.next;
            }

            a = a.next;
        }
        return null;
    }
        /*ListNode a=headA;
        ListNode b=headB;
        while(a!=null){
            a=(a==null) ? headA:a.next;
            b=(b==null) ? headA :b.next;
        }
        return a;*/

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }
}
