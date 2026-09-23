package class16;
import java.util.Scanner;
public class greatestOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int array[]=new int[size];
        for (int i = 0;i < array.length;i++) {
            array[i]=sc.nextInt();
        }
        int greatest=0;
        for (int i = 0; i<array.length ; i++) {
          if  (array[i] > array[greatest]){
              greatest=i;
            }
        }
        System.out.println(array[greatest]);
        System.out.println(greatest);
    }
}
