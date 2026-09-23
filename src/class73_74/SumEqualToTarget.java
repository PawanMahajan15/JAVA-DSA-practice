package class73_74;
import java.util.ArrayList;
import java.util.List;
public class SumEqualToTarget {
    public static void comb(int []candidates,List<Integer>cur,int target,List<List<Integer>>ans,int i){
        if(target<0)return;
        if(target==0){
            ans.add(new ArrayList<>(cur));
        return;
       }
        for (int j = i; j < candidates.length; j++) {
             cur.add(candidates[j]);
            comb(candidates, cur,target - candidates[j], ans, j);
            cur.removeLast();
        }
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>cur=new ArrayList<>();
        comb(candidates,cur,target,ans,0);
        return ans;
    }
    public static void main(String[] args) {
        int candidates[]={2,3,6,7};
        int target=7;
        System.out.println(combinationSum(candidates,target));
    }
}
