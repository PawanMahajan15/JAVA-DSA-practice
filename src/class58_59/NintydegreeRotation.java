package class58_59;

import java.util.Arrays;

public class NintydegreeRotation {
    public static int [] reverse(int arr[]){
        for (int i = 0; i < arr.length/2; i++) {
          int temp=arr[i];
          arr[i]=arr[arr.length-1-i];
          arr[arr.length-1-i]=temp;
        }
        return arr;
    }
    public static void transpose(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j < matrix.length/2; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=temp;
            }
        }

//        for (int i = 0; i < matrix.length; i++) {
//            matrix[i] = reverse(matrix[i]);
//        }
        for (int i = 0; i <matrix.length; i++) {
            System.out.print(Arrays.toString(matrix[i]));
        }
    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3}, {4,5,6}, {7,8,9}};
          transpose(arr);
    }
}
