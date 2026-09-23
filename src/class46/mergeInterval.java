package class46;
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;

public class mergeInterval {
    public static void main(String[] args) {
        int arr[][]={{1,3},{8,10},{11,14},{15,18}};
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }
        ArrayList<int[]>list=new ArrayList<>();
        for (int []interval:arr){
            int size=list.size();
            if (size==0||list.get(size-1)[1]<interval[0]){
                    list.add(interval);
            }else{
                list.get(size-1)[1]=Math.max(list.get(size-1)[1],interval[1]);
            }
        }
         int [][]ans=new int[list.size()][2];
        for (int i = 0; i <list.size() ; i++) {
            ans[i]= list.get(i);
        }
        for (int i = 0; i <ans.length ; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }
}
