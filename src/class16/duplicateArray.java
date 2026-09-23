package class16;

import java.util.Arrays;
import java.util.Scanner;

public class duplicateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        int copy[]=new int[arr.length];   //int copy[]=arr;
        for (int i = 0; i <arr.length; i++) {
             arr[i]=sc.nextInt();
        }
        for (int i = 0; i <arr.length ; i++) {
            copy[i]= arr[i];
        }
        System.out.println(Arrays.toString(copy));
    }
}
