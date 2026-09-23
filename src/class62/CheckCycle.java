package class62;

import class61.MyLinkList;

public class CheckCycle {
    public static boolean cycleCheck(MyLinkList list){
        MyLinkList slow=list;
        MyLinkList fast=list;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast)return true;
        }
        return false;
    }
    public static void main(String[] args) {
        MyLinkList list=new MyLinkList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(3);
        System.out.println(cycleCheck(list));
    }
}
