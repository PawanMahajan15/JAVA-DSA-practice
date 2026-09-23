package Class34;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashsetTreeset {
    public static void main(String[] args) {
        int arr[]={1,2,4,1,13,2,544,56,67,67,1,2,24,4,4};
        Set<Integer>set=new HashSet<>();//hashSet does not give sorted set  but its time complexity is O(1)
        for (int a:arr)set.add(a);{
            System.out.println(set);
        }
        Set<Integer>set2=new TreeSet<>();
        for (int a:arr)set2.add(a);{//treeSet give sorted set  but its time complexity is not fixed
            System.out.println(set2);
        }
    }
}
