package CLASS1To7;

import java.util.Scanner;
public class Hasnext {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        if(sc.hasNextInt()){
        int a=sc.nextInt();
            System.out.println(" data = " + a );// hasnext ka kam sirf int value ko dekhna hai or agar user character value bhe likhta hai to without error compile karne k liye use hota hai

        }
        else{
            System.out.println("invalid data ");
        }
    }
}
