package class28;
class pitaji{
    int d1=36;
   void t12(){
       System.out.println("namaste india");
   }
}
class bacchu1 extends pitaji{
    int d1=378;
    void t12(){                                     //when have exact same method deffination then it is known as methodoveriding
        System.out.println("good morning india");
    }                                              //when have same method deffination but different parameter then it is known as method overloading
}
public class MethodOverriding {
    public static void main(String[] args) {
        bacchu1 obj=new bacchu1();
        System.out.println(obj.d1);//if reference is of child class then it will find in both class parent and child also
        obj.t12(); //method overriding
        pitaji obj1=new bacchu1();
        System.out.println(obj1.d1);//if reference is of parent class and obj is of child class then it will find only in parent class

    }
}

