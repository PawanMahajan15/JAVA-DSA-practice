package class27;
 class parent {
   public void method(){
       System.out.println("its parent class");
   }
}
public class singleInheritance extends parent {
    public void method2() {
        System.out.println("main class");
    }
    public static void main(String[] args) {
        singleInheritance obj=new singleInheritance();
        obj.method2();
        obj.method();
    }
}
