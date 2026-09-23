package Class26;

import java.sql.SQLOutput;

public class ExecutionOrder {
    int a=34;
    static int b=57;
    static {
        System.out.println("i am Static block");
    }
    ExecutionOrder(){
        System.out.println("i am constructor");
    }
   {
       System.out.println("i am initializer block");
    }
    public static void main(String[] args) {
        System.out.println(ExecutionOrder.b);
        ExecutionOrder obj=new ExecutionOrder();
ExecutionOrder obj2=new ExecutionOrder();
        System.out.println("main block");
    }
}
