package class16;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        int temp[]=new int[arr.length];
        for (int i = 0; i <arr.length; i++) {
            arr[i]=sc.nextInt();
        }
      /*  int i=0,j= arr.length-1;
            while(i<j){
                int temporary=arr[i];
                arr[i]=arr[j];
                arr[j]=temporary;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));  */
        for (int i = arr.length-1; i>=0; i--) {
            temp[i]=arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(temp));
    }
}
