package class21;
import java.util.Scanner;
public class CountOnlyLowerCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[26];
        String name= sc.nextLine();
        for (int i = 0; i <name.length() ; i++) {
            char ch=name.charAt(i);
            arr[ch-97]++;
        }
        for (int i = 0; i <26 ; i++) {
            if(arr[i]>0){
                System.out.println(((char)(i+97))+" -> "+arr[i]);
            }
        }
    }
}
