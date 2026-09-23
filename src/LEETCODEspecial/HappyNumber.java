package LEETCODEspecial;
import java.util.*;
import java.util.Scanner;
public class HappyNumber {
    public static boolean happy(int n){
        ArrayList<Integer> arr= new ArrayList<>();
        while(true){
            int sum=0;
            while(n>0) {
                int temp = n % 10;
                sum = sum + (temp * temp);
                n = n / 10;
            }
            if(sum==1){
                    return true;
                }else if(arr.contains(sum)){
                    return false;
                }else {
                    arr.add(sum);
                    n=sum;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(HappyNumber.happy(n));
    }
}
