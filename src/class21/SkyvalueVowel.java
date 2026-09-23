package class21;

import java.util.Scanner;

public class SkyvalueVowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        int vowel=0;
        int space=0;
        int consonant=0;
        for (int i = 0; i <word.length() ; i++) {
            if(word.charAt(i)==65||word.charAt(i)==69||word.charAt(i)==73||word.charAt(i)==79||word.charAt(i)==85
                ||word.charAt(i)==97||word.charAt(i)==101||word.charAt(i)==105||word.charAt(i)==111||word.charAt(i)==117){
                vowel++;
            } else if (word.charAt(i)==' ') {
                space++;
            }else if(word.charAt(i)>=65&&word.charAt(i)<=128){
                consonant++;
            }
        }
        System.out.println("vowel= "+vowel+"\nspace= "+space+" \nconsonant= "+consonant);
    }
}
