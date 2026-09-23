package class16;
import java.util.Arrays;
import java.util.Scanner;
public class sortingOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                int temp = arr[i];
                if (arr[i] < arr[j + 1]) {
                    arr[i] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int temp=arr[0];
        for (int i = 0; i < arr.length-1 ; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
}