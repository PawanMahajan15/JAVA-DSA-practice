package class67;

import class61.ListNode;

public class StackUsingLL {
   private ListNode head;
    public StackUsingLL(){
        head=null;
    }
    public void push(int data){
        ListNode node=new ListNode(data);
        if(head==null){
            head=node;
            return;
        }
        node.next=head;
        head=node;
    }
    public Integer pop(){
        if(head==null)return null;
        int ans= head.data;
        head=head.next;
        return ans;
    }
    public Integer peek(){
        if(head==null)return null;
        return head.data;
    }
    public String tostring(){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        ListNode temp=head;
        while(temp!=null){
            sb.append(temp.data);
            if(temp.next!=null){
                sb.append(",");
            }
            temp=temp.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
