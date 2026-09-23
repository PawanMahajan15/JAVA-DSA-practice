package class21;
import java.util.Arrays;
import java.util.Scanner;
public class PrifixCheeck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        String arr[]=new String[size];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]= sc.next();
        }
        int c=0;
        String pref= sc.next();
        for (String word:arr) {
           if( word.startsWith(pref)) {
               c++;
           }
        }
        System.out.println(c);
    }
}
