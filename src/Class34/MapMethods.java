package Class34;
import java.util.HashMap;
import java.util.Map;
public class MapMethods {
    public static void main(String[] args) {
        Map<String,Integer>map=new HashMap<>();
        map.put("jai",8);
        map.put("krish",3);
        map.put("key",4);
        map.put("raj",0);
        System.out.println(map.get("krish"));
        System.out.println(map.containsKey("jai"));
        System.out.println(map.containsValue(0));
        map.remove("krish");
        System.out.println(map);
        map.replace("key",8);
        System.out.println(map);
    }
}
