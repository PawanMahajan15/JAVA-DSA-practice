package class16;

import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <arr.length-1; i++) {
            int small=i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j] < arr[small])
                    small = j;
            }
            if(i!=small) {
                int temp = arr[i];
                arr[i] = arr[small];
                arr[small] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
