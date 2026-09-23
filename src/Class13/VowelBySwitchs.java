package Class13;

import java.util.Scanner;

public class VowelBySwitchs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char input =sc.nextLine().charAt(0);
        switch (input){
            case 'a','e','i','o','u','A','E','I','O','U'-> System.out.println("vowel");
            default -> {
                if (input >= 'a' && input <= 'z'||input >= 'A' && input <= 'Z'){
                    System.out.println("consonant");
                    }else {
                    System.out.println("Not a letter");
                }
            }
        }

    }
}
