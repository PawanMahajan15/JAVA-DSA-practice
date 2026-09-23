package class55_56;
import java.util.HashMap;
import java.util.Map;
public class SubarraysSumK {
    private static int subarray(int nums[],int k){
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int ans=0;
        int csum=0;
        for(int c:nums){
            csum+=c;
            if(map.containsKey(csum-k)){
                ans=ans+map.get(csum-k);
            }
            map.put(csum,map.getOrDefault(csum,0)+1);
        }
        return ans;
    }
    public static void main(String[] args) {
      int arr[]={1,3, 4, 7, 2, -3, 1, 4, 2};
      int k=7;
        System.out.println(subarray(arr,k));
    }
}
