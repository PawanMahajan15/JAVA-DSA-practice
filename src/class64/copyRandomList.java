package class64;
import class61.ListNode;
import java.util.HashMap;
import java.util.Map;
public class copyRandomList {
    public static ListNode deepCopy(ListNode head){
        if(head==null)return head;
        Map<ListNode,ListNode>map=new HashMap<>();
        ListNode temp=head;
        ListNode ans=new ListNode(head.data);
        ListNode copy=ans;
        map.put(temp,copy);
        while(temp!=null){
        if (temp.next!=null){
            copy.next=new ListNode(temp.next.data);
            map.put(temp.next,copy.next);
        }
        temp=temp.next;
        copy=copy.next;
        }
        temp=head;
        copy=ans;
        while(temp!=null){
            if(temp.random!=null){
                copy.random=map.get(temp.random);
            }
            copy=copy.next;
            temp=temp.next;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println();
    }
}
