package class27;
class grandParent{
    public void methods1(){
        System.out.println("grand parents");
    }
}
class parents extends grandParent{
    public void methods2(){
        System.out.println("parents");
    }
}
class child extends parents{
    public void method3(){
        System.out.println("child");
    }
}
public class multilevelInherit extends child {
    public void method4() {
        System.out.println("main class");
    }
    public static void main(String[] args) {
        child obj = new child();
         obj.methods1();
         obj.methods2();
         obj.method3();
    }
}
