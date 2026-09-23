package Class34;
import java.util.HashMap;
import java.util.Map;
public class mapPrintingMetods {
    public static void main(String[] args) {
        Map<Character,Integer>map=new HashMap<>();
        map.put('k',1);
        map.put('e',9);
        map.put('r',2);
        map.put('h',null);
        System.out.println(map); //method 1
       for (Map.Entry<Character,Integer>k:map.entrySet()){   //method 2
            System.out.println(k.getKey()+" "+k.getValue() );
            }
       map.forEach((k,v)-> System.out.println(k+" "+v));//method 3
    }
}
