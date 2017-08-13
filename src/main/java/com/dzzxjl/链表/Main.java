package com.dzzxjl.链表;


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Main {
    public static final int MAX_SIE = 10000;
    static public ListNode removeElements(ListNode head, int val) {
        if (head == null){
            return null;
        }
        ListNode nodeA = head;
        ListNode nodeB = head.next;
        while(nodeB != null) {
            System.out.println("@@@" + nodeB.val);
            if(nodeB.val == val) {
                nodeA.next = nodeB.next;
                nodeB = nodeB.next;
               // System.out.println(nodeB.val);
               //不能使用break，此时跳出循环
            } else {
                nodeA = nodeA.next;
                nodeB = nodeB.next;
            }

        }
        return head;
    }

    public static void main(String[] args) {
        System.out.println(MAX_SIE);
//        int[] arrat = new int[];
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(6);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            temp = temp.next;
        }
        System.out.println();
        removeElements(head , 6);
        temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            temp = temp.next;
        }
    }
}