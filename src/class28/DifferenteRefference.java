package class28;
class parentmain{
    parentmain(){
        System.out.println("parent");
    }
}
class  childmain extends parentmain{
    childmain(){
        System.out.println("child");
    }
        }
public class DifferenteRefference  {
    public static void main(String[] args) {
       parentmain obj=new childmain();//you can assign child object into parent refference
      // childmain obj2=new parentmain();//you cannot assign parent object into child refference
    }
}
