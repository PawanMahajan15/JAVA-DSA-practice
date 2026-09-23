package class44;

import java.util.ArrayList;

public class Implimentation_Of_Array_List {
    public static  void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(null);
        System.out.println(list1);
         MyArrayList list=new MyArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        MyArrayList list2=new MyArrayList(10);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);
       list2.add(11);
        System.out.println(list2);
        System.out.println(list2.get(1));
        System.out.println(list.size());
    }
}
