package class41;
import java.util.*;
import java.lang.*;
public class FactorsOfN {
    public static List<Integer> factors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int i=1;
        for (; i <=Math.sqrt(n); i++)
            if (n % i == 0) {
                list.add(i);
            }
        for(i=(int)Math.sqrt(n);i>=1;i--) {
            if (n % i == 0) {
                if (i != Math.sqrt(n)) {
                    list.add(n / i);
                }                                      //time comlixity=O(Sqrt(n))
            }
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(factors(6));
    }
}
