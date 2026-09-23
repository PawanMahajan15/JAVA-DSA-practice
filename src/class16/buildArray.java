package class16;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class buildArray {
    public int[] buildArray(int[] nums, int n) {
        int []arr=new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            arr[i]=nums[nums[i]];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []nums=new int[size];
        for (int i=0;i<nums.length;i++) {
            nums[i] = sc.nextInt();
        }
        buildArray obj=new buildArray();
        int arr[]=obj.buildArray(nums,size);
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]+" ");
//        }
        System.out.println(Arrays.toString(arr));
    }

}
