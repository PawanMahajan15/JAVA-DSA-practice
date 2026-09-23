package class58_59;

import java.util.Arrays;
import java.util.Scanner;

public class transposeMatrix {
    private static void transpose(int matrix[][]){
        int row=matrix.length;
        int col=matrix[0].length;
        int ans[][]=new int[col][row];
        for (int i = 0; i <row; i++) {
            for (int j = 0; j <col ; j++) {
                ans[j][i]=matrix[i][j];
            }
        }
        for (int i = 0; i <ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  row= sc.nextInt();
        int  col=sc.nextInt();
       int arr[][]=new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <col ; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        transpose(arr);
       for (int i = 0; i <row; i++) {
                System.out.print(Arrays.toString(arr[i]));
        }
    }
}
