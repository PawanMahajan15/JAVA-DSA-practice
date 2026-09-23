package class73_74;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class combinationSum2 {
    public static void sub(int []candidates, List<List<Integer>>ans, List<Integer>cur, int target, int i){
        if(target<0)return;
        if(target==0){
            ans.add(new ArrayList<>(cur));
            return;
        }
        for(int j=i;j<candidates.length;j++){
            if(j>i&&candidates[j]==candidates[j-1])continue;
            cur.add(candidates[j]);
            sub(candidates,ans,cur,target-candidates[j],j+1);
            cur.removeLast();
        }
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>cur=new ArrayList<>();
        sub(candidates,ans,cur,target,0);
        return ans;
    }
    public static void main(String[] args) {
        int  candidates[]={1,1,2,5,6,7};
        int target=8;
        System.out.println( combinationSum2(candidates,target));

    }
}
