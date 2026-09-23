package class21;

import java.util.Scanner;

public class CountFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name = sc.nextLine();
        int  arr[]=new int[128];
        for (int i = 0; i <name.length(); i++) {
            char ch=name.charAt(i);
            arr[ch]++;
        }
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>0){
                System.out.println(((char)(i))+" -> "+arr[i]);
            }
        }
    }
}
