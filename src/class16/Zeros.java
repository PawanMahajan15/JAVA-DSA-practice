package class16;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int i=0,j=arr.length-1;
        while (i<j){
            if(arr[i]==0&&arr[j]==1){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            else {
                if (arr[i] != 0) i++;
                if (arr[j] != 1) j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
