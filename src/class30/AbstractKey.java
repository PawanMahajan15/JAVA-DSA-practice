package class30;

abstract class phone {
    void l1(){
        System.out.println("abstract ");
    }
    static void l2(){
        System.out.println("jai shree ram");
    }
    phone(){
        int a=9;
        System.out.println(a);
    }
}
abstract class smartPhone extends phone{
     abstract void l3();
     smartPhone(){
         System.out.println("kuch nahi");
     }
}
abstract class iphone extends smartPhone{
      abstract void l4();
}
public class AbstractKey extends iphone{
    public static void main(String[] args) {
       phone.l2();
       AbstractKey obj=new AbstractKey();
       obj.l1();
       obj.l3();
       obj.l4();
    }

    @Override                                         //@Override =notation
    void l4() {
        System.out.println("jai");
    }

    @Override
    void l3() {
        System.out.println("k");
    }
}
