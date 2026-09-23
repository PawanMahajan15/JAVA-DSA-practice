package class63;

import class61.ListNode;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode ans=new ListNode(-1);
        ListNode temp=ans;
        while(l1!=null||l2!=null){
            int sum=carry;
            if(l1!=null){
                sum+=l1.data;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.data;
                l2=l2.next;
            }
            temp.next=new ListNode (sum%10);
            temp=temp.next;
            carry=sum/10;
        }
        if(carry>0)temp.next=new ListNode(carry);
        return ans.next;
    }
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(1);
        ListNode l3=new ListNode(6);
        ListNode l4=new ListNode(4);
        ListNode l5=new ListNode(4);
        ListNode l6=new ListNode(4);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        l5.next=l6;
        ListNode k1=new ListNode(1);
        ListNode k2=new ListNode(1);
        ListNode k3=new ListNode(7);
        ListNode k4=new ListNode(4);
        ListNode k5=new ListNode(4);
        ListNode k6=new ListNode(9);
        k1.next=k2;
        k2.next=k3;
        k3.next=k4;
        k4.next=k5;
        k5.next=k6;
        System.out.println(addTwoNumbers(l1,k1));
    }
}
