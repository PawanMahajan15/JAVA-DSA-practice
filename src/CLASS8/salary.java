package CLASS8;

import javax.swing.*;
import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char gender=sc.next().charAt(0);
        sc.nextLine();
        int year=sc.nextInt();
        char Q=sc.next().charAt(0);
        if (gender=='M'||gender=='m'){
            if(year>=10){
                if (Q=='P'){
                    System.out.println("15000");
              }else if (Q=='U'){
                    System.out.println("10000");
                }
            }else if(year<10)
            { if (Q=='P'){
                System.out.println("10000");
            }else if (Q=='U') {
                System.out.println("7000");
                }
            }
        }else if (gender=='F'||gender=='f'){
            if(year>=10){
                if (Q=='P'){
                    System.out.println("12000");
                }else if (Q=='U'){
                    System.out.println("9000");
                }
            }else if(year<10)
            { if (Q=='P'){
                System.out.println("10000");
            }else if (Q=='U') {
                System.out.println("6000");
            }
            }
        }
    }
}
