package CLASS1To7;

import java.util.Scanner;
public class userInput2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name");
        String name= sc.nextLine();
        System.out.println("enter age");
        int age=sc.nextInt();
        System.out.println("hello " + name + " you are " + age + " years old");


    }
}
