package class17;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeDarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int size2= sc.nextInt();
        int size3= sc.nextInt();
        int arr[][][]=new int[size][size2][size3];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                for (int k = 0; k <arr[i][j].length ; k++) {
                    arr[i][j][k]=sc.nextInt();
                }
            }
        }
//        for (int i = 0; i < arr.length ; i++) {
//            for (int j = 0; j <arr[i].length ; j++) {
//                System.out.println(Arrays.toString(arr[i][j]));
//            }
//            System.out.println();
//        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                for (int k = 0; k <arr[i][j].length ; k++) {
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
        }
    }
}
