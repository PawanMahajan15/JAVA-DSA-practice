package class61;
public class MyLinkList {
    public MyLinkList next;
    public int  data;
    ListNode head;
    int size;
    public MyLinkList(){
        head=null;
        size=0;
    }
    public void add(int data){
        add(size,data);
    }
    public void addFirst(int data){
            ListNode node=new ListNode(data);
            node.next=head;
            head=node;
            size++;
    }
    public  int size(){
        return size;
    }
    public void add(int Index,int data){
      if(Index<0||Index>size)
         throw new ArrayIndexOutOfBoundsException("at index :"+Index+" for size: "+ size);
     if(Index==0) addFirst(data);
     else {
         ListNode node=new ListNode(data);
         ListNode temp=head;
         Index--;
         while (Index> 0) {
             temp=temp.next;
             Index--;
         }
         node.next=temp.next;
         temp.next=node;
         size++;
     }
    }
    public Integer remove(){
        if (head==null)return null;
        int removal=head.data;
       head=head.next;
       size--;
       return removal;
    }
    public Integer removeFirst(){
        return remove();
    }
    public Integer removeLast(){
      return   remove(size-1);
    }
   public int remove(int Index){
       if(Index<0||Index>size)
           throw new ArrayIndexOutOfBoundsException("at index :"+Index+" for size: "+ size);
       if (Index==0){
           return remove();
       }
           ListNode p=head;
           Index--;
           while(0<Index){
               p=p.next;
               Index--;
           }
           int remove=p.next.data;
           p.next=p.next.next;
            size--;
       return remove;
    }
    public boolean search(int data){
        ListNode temp=head;
        while(size!=0){
            if(temp.data==data)return true;
            else {
                temp=temp.next;
                size--;
            }
        }
        return false;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        ListNode temp=head;
        while(temp!=null) {
            sb.append(temp.data);
            if(temp.next!=null) {
                sb.append(", ");
            }
            temp=temp.next;
        }
        sb.append("]");
        return sb.toString();
    }

}
