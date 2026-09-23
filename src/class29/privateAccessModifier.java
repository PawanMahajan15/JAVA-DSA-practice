package class29;
class p1{
    private int i=19;
            int j=92;
    private void m1(){
        System.out.println("jai shree ram");
    }
    void m2(){
        System.out.println("kya kar rahe ho");
    }
}
public class privateAccessModifier {
    public static void main(String[] args) {
        p1 obj=new p1();
      //  obj.m1();
       // System.out.println(obj.i);
        // if we decleare private and in same package it can not access in different class
        obj.m2();//if it is not private then it can be access
        System.out.println(obj.j);
    }
}
