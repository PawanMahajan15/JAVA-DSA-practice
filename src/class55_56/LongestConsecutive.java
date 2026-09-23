package class55_56;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    private static int sequence(int nums[]){
        Set<Integer>set=new HashSet<>();
        int ans=0;
        int count=0;
        for(int a:nums){
            set.add(a);
        }

        for(int a:set){
            if(!set.contains(a-1)){
                count=0;
                while(set.contains(a)){
                    count++;
                    a++;
                }
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]= {-1,0,1,2,3};
        System.out.println(sequence(arr));
    }
}
