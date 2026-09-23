package class55_56;

import java.util.*;

public class ArrayIntersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>set=new HashSet<>();
        Set<Integer>set1=new HashSet<>();
        for(Integer i:nums1){
            set.add(i);
        }
        for(Integer i:nums2){
            set1.add(i);
        }
        set.retainAll(set1);
        int arr[]=new int[set.size()];
        int i=0;
        for (int a:set){
           arr[i++]=a;
        }
        return arr;
    }
    public static void main(String[] args) {
        Set<Integer>set=new HashSet<>();
        int nums1[]={1,2,2,1};
        int nums2[]={2,2};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
}
