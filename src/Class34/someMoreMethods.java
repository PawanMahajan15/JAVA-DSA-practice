package Class34;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class someMoreMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(34);
        list.add(32);
        list.add(29);
        System.out.println(list.get(2));
        System.out.println(list.contains(32));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.add(3,80);
        System.out.println(list.indexOf(80));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.remove(3);
        System.out.println(list);
    }
}
