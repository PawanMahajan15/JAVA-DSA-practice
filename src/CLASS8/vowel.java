package CLASS8;

import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       char input=sc.next().charAt(0);
        if(input =='a'|| input=='e'|| input=='i' ||input =='o'||input=='u' ||
           input=='A'|| input=='E'|| input=='I'||input=='O'||input =='U'){
            System.out.println("vowel");
        }else if(input>='a'&&input<='z'||input>='A'&&input<='Z') {
            System.out.println("consonant");
        }else {
            System.out.println("invalid output");
        }
    }
}
