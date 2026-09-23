package class21;
import java.util.Scanner;
public class Anagrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        String t=sc.nextLine();
        int arr[]=new int[26];
        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            arr[ch-97]=arr[ch-97]+1;
        }
        for (int i = 0; i <t.length() ; i++) {
            char ch=t.charAt(i);
            arr[ch-97]=arr[ch-97]-1;
        }
        for (int i = 0; i <26; i++) {
            if(arr[i]>0){
                System.out.println("not an anagram");
            return;
            }
        }
        System.out.println("anagram");
    }
}
