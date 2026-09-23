package class35_36_37_38_39_40;

public class Whatrecursion {
   static int a=1;
    public static void m1(){
        System.out.println(a++);                          //recursion without base case
        m1();
    }
    public static void main(String[] args) {
        m1();
    }
}
