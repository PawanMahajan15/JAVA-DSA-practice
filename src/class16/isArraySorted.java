package class16;

import java.util.Arrays;
import java.util.Scanner;

public class isArraySorted {
    public static boolean isArraySorted(int array[]) {

        for (int i = 1; i < array.length; i++) {
            if (array[i-1] > array[i]) {
                return true;
            }
        }return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int array[]=new int[size];
        for (int i = 0; i <array.length; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println(isArraySorted.isArraySorted(array));
    }
}