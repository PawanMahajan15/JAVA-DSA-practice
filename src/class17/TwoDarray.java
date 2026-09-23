package class17;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int arr[][]={{2,4,6},{1,22,25}};
       // int arr[][]=new int[2][4];
        int size= sc.nextInt();
        int size2= sc.nextInt();
        int arr[][]=new int[size][size2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
//        for (int i = 0; i < arr.length ; i++) {
//            for (int j = 0; j <arr[i].length; j++) {
//                System.out.println(arr[i][j]);
//            }
//        }
        for (int i = 0; i <arr.length ; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
