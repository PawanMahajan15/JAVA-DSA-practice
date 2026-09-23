package class65;

import class61.ListNode;

public class QusingLinkedList {
     private ListNode head;
    private ListNode tail;
     public QusingLinkedList(){
         head=tail=null;
     }
     public void offer(int data){
        ListNode node=new ListNode(data);
        if(tail==null){
            head=tail=node;
            return;
        }
        tail.next=node;
        tail=node;
     }
     public Integer pull(){
         if(head==null)return null;
         int ans=head.data;
         head=head.next;
         if(head==null){
             tail=null;
         }
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
