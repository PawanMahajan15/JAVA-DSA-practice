package class15;

import java.util.Scanner;

/*public class add {
    public int addition(int x,int y){
           int sum=x+y;
           return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        add obj=new add();
        int c=obj.addition(a,b);
        System.out.println(c);
    }
}             */
public class add {
    public static int addition(int a,int b){
      // int sum=a+b;
       // return sum;
        return a+b;
    }
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int a= input.nextInt(), b=input.nextInt();
      //  int c=addition(a,b);
       // System.out.println(c);
        System.out.println(add.addition(a,b));
    }
}
