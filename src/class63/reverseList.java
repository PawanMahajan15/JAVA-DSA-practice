package class63;

import class61.ListNode;
public class reverseList {
    public static ListNode recursive(ListNode l1,ListNode prev){
        if(l1==null)return prev;
        {
            ListNode temp = l1.next;
            l1.next = prev;
            prev = l1;
            l1 = temp;
        }
        return recursive(l1,prev);
    }
    public static ListNode reverse(ListNode l1){
       ListNode prev=null;
       while(l1!=null){
           ListNode temp=l1.next;
           l1.next=prev;
           prev=l1;
           l1=temp;
       }
       return prev;
    }
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(4);
        ListNode l5=new ListNode(5);
        ListNode l6=new ListNode(6);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        l5.next=l6;
        System.out.println(reverse(l1));
        System.out.println(recursive(l1,null));
    }
}
