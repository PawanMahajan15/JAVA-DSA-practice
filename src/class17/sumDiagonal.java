package class17;

import java.util.Scanner;

public class sumDiagonal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int size2= sc.nextInt();
        int arr[][]=new int[size][size2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
                }
            System.out.println();
            }
        int left=0;
        int right=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               if(i==j){
                   left=left+arr[i][j];
               }
               if(i+j==arr.length-1){
                   right=right+arr[i][j];
               }
            }
        }
        System.out.println(right+" , "+left);
    }
}
