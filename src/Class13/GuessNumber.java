package Class13;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=(int)((Math.random()*100)+1);
        System.out.println("guess the number");
        int  times=10;
        int number;
        do {
            number= sc.nextInt();
            if(target==number){
                System.out.println("congrats");
                break;
            }
            if(--times==0)break;
            if(target>number){
                System.out.println("too low think bigger,only "+ times + " attempt left");
            }
            if(target<number){
                System.out.println("too high, think smaller,only "+ times + " attempt left");
            }
        }while (true);
    }
}
