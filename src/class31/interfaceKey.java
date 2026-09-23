package class31;
class father implements child {
    public void padhai(){
       System.out.println("maths");
      }
}
class mother implements child {
     public void padhai(){
         System.out.println("bio");
     }
}
interface child {
    int a=67;
    void padhai();
}

public class interfaceKey {
    public static void main(String[] args) {
        father obj=new father();
        obj.padhai();
        mother obj1=new mother();
        obj1.padhai();

        System.out.println(child.a);
    }
}
