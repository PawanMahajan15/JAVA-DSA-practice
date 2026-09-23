package class21;
import java.util.Arrays;
import java.util.Scanner;
public class SplitChange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Sentence=sc.nextLine();
       String arr[]= Sentence.split(" ");
       String temp[]=new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length()==1){
                arr[i]= arr[i].toUpperCase();
            }else {
                temp[i] = arr[i].toUpperCase();
                char ch = temp[i].charAt(0);
                char last = temp[i].charAt(temp[i].length() - 1);
                temp[i] = ch + arr[i].substring(1, arr[i].length() - 1) + last;
                arr[i] = temp[i];
            }
        }String ans="";
        for (int i = 0; i <arr.length; i++) {
            ans=ans+arr[i]+" ";
        }
        System.out.println(ans.trim());
    }
}
