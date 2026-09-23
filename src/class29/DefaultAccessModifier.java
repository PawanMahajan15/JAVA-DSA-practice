package class29;
class anuj{
     protected int a=89;
    void ghungru(){
        System.out.println("hindu rashtra");
    }
}
public class DefaultAccessModifier extends anuj{
    public static void main(String[] args) {
     anuj obj=new anuj();
       obj.ghungru();
    }
}
