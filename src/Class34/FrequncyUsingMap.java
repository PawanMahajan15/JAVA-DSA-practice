package Class34;
import CLASS8.ElectricityBill;
import javax.swing.*;
import java.util.*;
public class FrequncyUsingMap {
    public static void main(String[] args) {
        int arr[]={1,1,1,1,1,5,54,7,8,9,8,7,5,5,4,3,0};
        Map<Integer,Integer>map=new HashMap<>();
//        for(int element:arr){
//            if(map.containsKey(element)){
//               int prev=map.get(element);
//               prev++;
//               map.put(element,prev);
//            }else{
//                map.put(element,1);
//            }
//        }
        //we will decrease the size of code by some logic
//        for(int element:arr){
//            if(map.containsKey(element)){
//                map.put(element,map.get(element)+1);
//            }else {
//                map.put(element,1);
//            }
//        }
        //we have a new method getOrDefault it also decreases the size
        for (int element:arr){
            map.put(element,map.getOrDefault(element,0)+1);
        }
        System.out.println(map);
    }
}
