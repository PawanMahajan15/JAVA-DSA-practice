package class10and11;

import java.util.Scanner;

public class TOTALdivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x= sc.nextInt();
        int count=0;
        for (int i = 1; i <=n; i++) {
            int total=0;
            for (int j = 1; j <=i; j++) {
                if (i%j==0){
                    total++;
                }if(total==x)
                    count++;
            }

        }
        System.out.println(count);
    }
}
