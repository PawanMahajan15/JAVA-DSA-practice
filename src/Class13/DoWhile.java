package Class13;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        do{
            System.out.println("jai shree ram");
            System.out.println("prees one to repeat");
             i=sc.nextInt();
        }while(i==1);
    }
}
