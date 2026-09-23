package class57;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayZerosOnes {
    private static int length(int arr[]){
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int csum=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)arr[i]=-1;
            csum+=arr[i];
            if(map.containsKey(csum)){
                int distance=i-map.get(csum);
                max=Math.max(max,distance);
            }else{
                map.put(csum,i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
     int arr[]={1,-1,1,-1,1,1,1,-1,-1,-1};
        System.out.println(length(arr));
    }
}
