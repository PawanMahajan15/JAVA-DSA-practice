package class45;

import java.util.Arrays;

public class removeDuplicate {
    public static int removeDuplicates(int[] nums) {
     int i=0,j=0;
     while(j<nums.length){
         if (nums[i]!=nums[j]){
             nums[++i]=nums[j];
         }else {
             j++;
         }
     }
     return i+1;
    }
    public static void main(String[] args) {
int arr[]={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
}
