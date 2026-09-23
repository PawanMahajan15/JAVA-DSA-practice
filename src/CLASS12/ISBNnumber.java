package CLASS12;

import java.util.Scanner;

public class ISBNnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long temp=n;
        long sum=0;
        long c=0;
        while (n!=0){
            c++;
            n=n/10;
        }if (c!=10){
            System.out.println("false");
        }else {
            n = temp;
            while (n != 0) {
                long  lastdigit = n % 10;
                lastdigit = lastdigit * c;
                c--;
                sum = sum + lastdigit;
                n = n / 10;
            }
            System.out.println(sum);
            System.out.println(sum % 11 == 0 ? "True" : "false");
        } }
    }

