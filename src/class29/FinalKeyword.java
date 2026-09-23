package class29;
class key{
    final int q=90;
    final void don(){
        System.out.println("jai shree mahakal");
    }
    class key2 extends key{
        int q=9;
//        void don(){
//            System.out.println("shree"); we can not override final method
//        }
    }
}
public class FinalKeyword {
    public static void main(String[] args) {
        key obj=new key();
       // obj.q=48; final variable cannot be change
        obj.don();
    }
}
