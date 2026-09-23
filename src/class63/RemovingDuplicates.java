package class63;
import class61.ListNode;
public class RemovingDuplicates {
    public static ListNode recursive(ListNode head){
        if(head==null||head.next==null)return head;
        ListNode ans=recursive(head.next);
        if(ans.data==head.data){
         return ans;
        }else {
            head.next=ans;
            return  head;
        }
    }
    public static ListNode Duplicates(ListNode head){
        if (head==null||head.next==null)return head;
        {
            ListNode temp = head;
            while (temp.next != null) {
                if (temp.data == temp.next.data) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
        }return head;
    }
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(1);
        ListNode l3=new ListNode(2);
        ListNode l4=new ListNode(4);
        ListNode l5=new ListNode(4);
        ListNode l6=new ListNode(4);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        l5.next=l6;
        System.out.println(Duplicates(l1));
    }
}
