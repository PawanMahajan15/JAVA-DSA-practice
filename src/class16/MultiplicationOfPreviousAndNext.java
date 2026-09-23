package class16;

import java.util.Scanner;

public class MultiplicationOfPreviousAndNext {
    public void updateArray(int[] arr, int n) {
        if(n==1){
            System.out.println(arr[0]);
        }
        else {
            int copy[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    copy[i] = arr[i] * arr[i + 1];
                } else if (i == arr.length - 1) {
                    copy[arr.length - 1] = arr[arr.length - 1] * arr[arr.length - 2];
                } else if (i > 0 && i < arr.length - 1) {
                    copy[i] = arr[i - 1] * arr[i + 1];
                }
            }
           for (int i = 0; i < arr.length; i++) {
                System.out.print(copy[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for (int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        MultiplicationOfPreviousAndNext obj=new MultiplicationOfPreviousAndNext();
       obj.updateArray(arr,size);
    }
}
