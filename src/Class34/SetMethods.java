package Class34;
import java.util.HashSet;
import java.util.Set;
public class SetMethods {
    public static void main(String[] args) {
        Set<Integer>set=new HashSet<>();
        set.add(90);
        set.add(34);
        set.add(24);
        set.add(34);
        System.out.println(set);
        set.remove(90);
        System.out.println(set.contains(24));
        System.out.println(set.size());

    }
}
