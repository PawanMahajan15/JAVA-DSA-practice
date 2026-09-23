package LEETCODEspecial;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayPairs {
    public  boolean divideArray(int nums[]){
        Arrays.sort(nums);
        int pairs=0;
        for (int i = 0; i <nums.length-1;) {
            if (nums[i] == nums[i + 1]) {
                pairs++;
                i += 2;
            } else {
                i++;
            }
        }
        if(pairs== nums.length/2){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int []nums=new int[size];
        for (int i = 0; i < nums.length ; i++) {
            nums[i]= sc.nextInt();
        }
        ArrayPairs obj=new ArrayPairs();

        System.out.println(obj.divideArray(nums));
    }
}
