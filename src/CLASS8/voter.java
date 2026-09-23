package CLASS8;

import java.sql.SQLOutput;
import java.util.Scanner;

public class voter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String name=sc.nextLine();
        int age= sc.nextInt();
        if (age>=18){
            System.out.println(name + " you are valid voter ");
        }else {
            System.out.println(name + " you  are not a valid voter ");
            System.out.println(name + " will be eligible in " + ( 18-age ) + " years ");
        }

    }
}
