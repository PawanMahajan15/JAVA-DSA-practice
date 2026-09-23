package class70_71_72;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset2 {
    public static void duplicate(int []nums,List<List<Integer>>ans,List<Integer>cur,int i,boolean picked){
        if(i==nums.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
        if(i==0||nums[i]!=nums[i-1]||picked) {
            cur.add(nums[i]);
            duplicate(nums, ans, cur, i + 1, true);
            cur.removeLast();
        }
        duplicate(nums,ans,cur,i+1,false);

    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
     List<List<Integer>>ans=new ArrayList<>();
     List<Integer>cur=new ArrayList<>();
     duplicate(nums,ans,cur,0,true);
     return ans;
    }
    public static void main(String[] args) {
     int []nums={1,2,2};
        System.out.println(subsetsWithDup(nums));
    }
}
