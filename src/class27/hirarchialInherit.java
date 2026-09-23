package class27;
class oneparent{
    public void m1(){
        System.out.println(" i am parent");
    }
}
class firstChild extends oneparent{
    public void m2(){
        System.out.println("i am first child");
    }
}
class secondChild extends oneparent{
    public void m3(){
        System.out.println("i am second child");
    }
}
public class hirarchialInherit {
    public static void main(String[] args) {
        secondChild obj =new secondChild();
        obj.m1();
        obj.m3();
        firstChild obj2=new firstChild();
        obj2.m2();
        obj2.m1();
    }
}
