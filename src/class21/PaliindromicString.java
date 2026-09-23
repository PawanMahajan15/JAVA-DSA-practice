package class21;

import java.util.Scanner;

public class PaliindromicString {
    public static String isPaliinDrome(String name){
        int i=0;
        int j=name.length()-1;
        while(i<j){
            if(name.charAt(i++)!=name.charAt(j--)){
                return "not palindrme";
            }
        }
        return "palindrome";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name= sc.nextLine();
        System.out.println(PaliindromicString.isPaliinDrome(name));
    }
}
