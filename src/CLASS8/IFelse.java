package CLASS8;

import java.util.Scanner;
public class IFelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("M/m for male,F/f for female,or any character other for guest");
        String Input = sc.nextLine();
        char gender = Input .charAt(0);
        if (gender =='m' || gender == 'M') {
            System.out.println("Hello,Sir!");

        } else if(gender == 'f' || gender=='F'){
            System.out.println("hello,ma'am!");
        } else
        {
            System.out.println("hello,guest!");

        }
    }
}