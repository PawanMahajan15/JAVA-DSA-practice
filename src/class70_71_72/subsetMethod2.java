package class70_71_72;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetMethod2 {
    public static void unique(int nums[],List<List<Integer>>ans,List<Integer>cur,int start){
        ans.add(new ArrayList<>(cur));
        for (int i= start; i <nums.length; i++) {
            cur.add(nums[i]);
            unique(nums,ans,cur,i+1);
            cur.removeLast();
        }
    }
    public static void duplicate(int nums[],List<List<Integer>>ans,List<Integer>cur,int start){
        ans.add(new ArrayList<>(cur));
        for (int i = start; i <nums.length; i++) {
            if(i>start&&nums[i]==nums[i-1])continue;
            cur.add(nums[i]);
            duplicate(nums,ans,cur,i+1);
            cur.remove(cur.size()-1);
        }
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        //unique(nums, ans, cur, 0);
        int arr[]={1,2,2,3};
        Arrays.sort(arr);
        duplicate(arr, ans, cur, 0);
        System.out.println(ans);
    }
}
