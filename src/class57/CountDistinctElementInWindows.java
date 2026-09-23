package class57;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountDistinctElementInWindows {
    private static ArrayList<Integer> windows(int arr[],int k){
        Map<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>() ;
        int i=0;
        int j=k;
        for(int a=i;a<j;a++)map.put(arr[a],map.getOrDefault(arr[a],0)+1);list.add(map.size());
        while(j<arr.length){
            if(map.get(arr[i])<=1)map.remove(arr[i]);
            else{
                map.put(arr[i],map.get(arr[i])-1);
            }
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            list.add(map.size());
          i++;j++;
        }
        return list;
    }
    public static void main(String[] args) {
        int  arr[]={1,2,3,4,3,3};
        int k=3;
        System.out.println(windows(arr,k));
        int a=Integer.MAX_VALUE;
        System.out.println(a);
    }
}
