package class21;

import java.util.Scanner;

public class ConsonantVowelSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int vowel = 0, space = 0, consonant = 0;
        //for(int i=0;i<=word.length();i++){
     //   char letter = word.charAt(i);
    //}
        for (char letter:word.toCharArray()) {
            switch (letter) {
                case'a','e','i','o','u','A','E','I','O','U'-> vowel++;
                case' '-> space++;
                default -> consonant++;
            }
        }
        System.out.println(vowel);
        System.out.println(space);
        System.out.println(consonant);

    }
}
