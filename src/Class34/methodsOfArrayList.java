package Class34;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class methodsOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(34);
        list.add(32);
        list.add(29);
        System.out.println(list);
        for (Integer k:list){
            System.out.println(k);
        }
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
