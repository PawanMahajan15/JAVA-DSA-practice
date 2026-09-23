package class16;

import java.util.Scanner;

public class sumOfArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please enter array size");
        int  size= sc.nextInt();
        System.out.println("please enter array elements");
        int[]array=new int[size];
        int sum=0;
        for (int i = 0; i <array.length ; i++) {
            array[i]= sc.nextInt();
            sum=sum+array[i];
        }
        System.out.println("sum= "+ sum);
        System.out.println("mean= " + (double)sum/size);
    }
}
