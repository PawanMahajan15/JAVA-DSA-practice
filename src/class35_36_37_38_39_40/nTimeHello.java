package class35_36_37_38_39_40;

public class nTimeHello {
    public static void  m1(int n){
        if(n==0)return;
        System.out.println("hello bhai");
        m1(n-1);
    }
    public static void main(String[] args) {
        m1(90);
    }
}
