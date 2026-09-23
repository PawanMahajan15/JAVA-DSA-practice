package class70_71_72;

import java.util.ArrayList;
import java.util.List;

public class SubsetOfArray {
    public static void sub(int[]arr,List<Integer> cur, List<List<Integer>>list,int i){
        if(i== arr.length){
            list.add(new ArrayList<>(cur));
            return;
        }
        cur.add(arr[i]);
        sub(arr,cur,list,i+1);
        cur.remove(cur.size()-1);
        sub(arr, cur, list, i+1);
    }
    public static List<List<Integer>> subsets(int[] nums) {
     List<List<Integer>>list=new ArrayList<>();
     List<Integer>cur=new ArrayList<>();
             sub(nums,cur,list,0);
             return list;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(subsets(arr));
    }
}
