package class16;

import java.util.Scanner;

public class linearSearching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for (int i = 0; i <arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==key){
                System.out.println(i);
                break;
            }
        }
        System.out.println("-1");
    }
}
