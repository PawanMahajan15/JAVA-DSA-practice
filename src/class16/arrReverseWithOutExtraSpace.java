package class16;

import java.util.Scanner;

public class arrReverseWithOutExtraSpace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for (int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        int j=arr.length;

        for (int i = 0; i <arr.length/2; i++) {
                int temp = arr[i];
                arr[i] = arr[j-i-1];
                arr[j-i-1] = temp;
        }
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
