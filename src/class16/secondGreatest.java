package class16;

import java.util.Scanner;

public class secondGreatest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int array[]=new int[size];
        for (int i = 0; i < array.length ; i++) {
            array[i]=sc.nextInt();
        }
        int first=Math.max(array[0],array[1]);
        int second=Math.min(array[0],array[1]);
        for (int i =2; i <array.length; i++) {
          if  (array[i]>first){
              second=first;
              first=array[i];
          } else if (array[i]>second) {
              second=array[i];
          }
        }
        System.out.println(second);
    }
}
