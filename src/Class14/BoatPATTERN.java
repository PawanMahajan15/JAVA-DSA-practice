package Class14;

import java.util.Scanner;

public class BoatPATTERN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i =1; i <=n/2; i++) {
            for (int j = 1; j <(n+1)/2 ; j++) {
                System.out.print("    ");
            }
            for (int j = (n+1)/2; j <=n; j++) {
                if (j==(n+1)/2||i+j==n+1||i==1) {
                    System.out.print((j)+"    ");
                }else{
                    System.out.print("     ");
                }
            }
            System.out.println();
        }
        for (int i =1; i <=n/2; i++) {
            for (int j = 1; j <=n; j++) {
                if(j==n/2){
                    System.out.print((j)+"");
                }else{
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
        for (int i =1; i <=n/2; i++) {
            for (int j = 1; j <=n; j++) {
                if (i == 1 ||j==i||i+j==n+1) {
                    System.out.print((char)(64+j)+"    ");
                }else {
                    System.out.print("     ");
                }
            }
                System.out.println();
        }
        for (int i =1; i <=n/4; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print("%     ");
            }
            System.out.println();
        }
    }
}
