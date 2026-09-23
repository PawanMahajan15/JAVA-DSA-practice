package class57;

import java.util.HashMap;
import java.util.Map;

public class MaxZeroOneLength {
    private static int length(int nums[]){
        Map<Integer,Integer>map=new HashMap<>();
        int ans=0;
        int length=0;
        for(int a:nums){
            if(a==1)map.put(1,map.getOrDefault(1,0)+1);
        }
        for(int a:nums){
            if(a==0&&map.containsKey(1)){
                if(map.get(1)>0){
                    map.put(1,map.get(1)-1);
                    length+=2;
                    if(map.get(1)==0)break;
                }
                else{
                    length=0;
                }
            }
        }
        return length;
    }
    public static void main(String[] args) {
        int []arr={0,1,0,0,0,0};
        System.out.println(length(arr));
    }
}
