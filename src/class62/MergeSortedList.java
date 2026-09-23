package class62;
import class61.MyLinkList;

import java.util.LinkedList;
public class MergeSortedList {
//    public static LinkedList<Integer> sorting(LinkedList<Integer>list1, LinkedList<Integer> list2){
//        LinkedList<Integer> ans=new LinkedList<>();
//        LinkedList<Integer> temp=ans;
//        while(list1!=null&&list2!=null){
//            if(list1.data<=list2.data){
//                temp.next=list1;
//                list1=list1.next;
//                temp=temp.next;
//            }else{
//                temp.next=list2;
//                list2=list2.next;
//                temp=temp.next;
//            }
//        }
//        if(list1!=null)temp.next=list1;
//        if(list2!=null)temp.next=list2;
//        return ans.next;
 //   }

    public static MyLinkList recursive(MyLinkList list1,MyLinkList list2){
        if(list1==null)return list2;
        if (list2==null)return list1;
        if(list1.data<=list2.data){
            list1.next=recursive(list1.next,list2);
            return list1;
        }else{
            list2.next=recursive(list1,list2.next);
            return list2;
        }
    }
    public static void main(String[] args) {
       MyLinkList list1=new MyLinkList();
        MyLinkList list2=new MyLinkList();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(8);
        list1.add(10);
        list2.add(1);
        list2.add(5);
        list2.add(7);
        list2.add(9);
        list2.add(12);
       System.out.println(recursive(list1,list2));
    }
}
