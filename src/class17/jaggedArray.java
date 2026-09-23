package class17;

import java.util.Scanner;

public class jaggedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][][]=new int[5][][];
        arr[0]=new int[2][5];
        arr[1]=new int[2][4];
        arr[2]=new int[2][3];
        arr[3]=new int[2][2];
        arr[4]=new int[2][1];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                for (int k = 0; k <arr[i][j].length ; k++) {
                    arr[i][j][k]=sc.nextInt();
                }
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                for (int k = 0; k <arr[i][j].length ; k++) {
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.print(",");
            }
            System.out.println();
        }
    }
}
