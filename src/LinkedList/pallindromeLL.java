package LinkedList;

import java.util.List;

public class pallindromeLL {
    static void main() {
        ListNode list=new ListNode(1);
        list.next=new ListNode(2);
        list.next.next=new ListNode(3);
        System.out.println("Original list: ");
        printList(list);
        pallindromeLL obj=new pallindromeLL();
        System.out.println("IS pallindrome: "+obj.isPallindrome(list));
    }
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public boolean isPallindrome(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev =null;
        while(slow!=null){
            ListNode next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }
        while(prev!=null){
            if(head.val !=prev.val){
                return false;
            }
            head=head.next;
            prev=prev.next;
        }
        return true;
    }
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
