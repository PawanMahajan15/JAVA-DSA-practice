package class64;
import class61.ListNode;
public class Reverse_K_Pairs {
    public static void reverse(ListNode start,ListNode end){
     ListNode c=start;
     ListNode prev=null;
     while(prev!=end){
         ListNode temp=c.next;
         c.next=prev;
        prev=c;
        c=temp;
     }
    }
    public static ListNode join(ListNode head,int k){
        if(head==null||head.next==null||k==1)return head;
        ListNode start=head;
        ListNode end=head;
        int index=k-1;
        while(index>0){
            end=end.next;
            if(end==null)return head;
            index--;
        }
       ListNode ans=join(end.next,k);
       reverse(start,end);
       start.next=ans;
       return end;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(4);
        ListNode l5=new ListNode(5);
        ListNode l6=new ListNode(6);
        ListNode l7=new ListNode(7);
        ListNode l8=new ListNode(8);

        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        l5.next=l6;
        l6.next=l7;
        l7.next=l8;
        int k=3;
        System.out.println(join(l1,k));
    }
}
