package class21;

import java.util.Arrays;
import java.util.Scanner;

public class lexicographically {
    public static void main(String[] args) {
        String ans="";
        Scanner sc=new Scanner (System.in);
        String name =sc.nextLine();
        String arr[]=name.split(" ");
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 1+i; j <arr.length; j++) {
                if(arr[i].compareToIgnoreCase(arr[j])>0){
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i=0;i<arr.length ;i++ ){
            ans=ans+arr[i]+" ";
        }
        System.out.println(ans);
    }
}
