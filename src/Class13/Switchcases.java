package Class13;

import java.util.*;

public class Switchcases {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System. in);
        String shape=sc.nextLine();
        switch(shape){
            case "circle"->{
                System.out.println("please enter radius");
                int radius=sc.nextInt();
                System.out.println(Math.PI*(Math.pow(radius,2)));
            }
            case "triangle"->{
                System.out.println("please enter base and height");
                float base=sc.nextFloat(),height=sc.nextFloat();
                System.out.println((base*height)/2);
            }
            case "rectangle"->{
                System.out.println("please enter length and width");
                Float length=sc.nextFloat(),width=sc.nextFloat();
                System.out.println(length*width);
            }
            default -> System.out.println("Invalid Shape");
        }

    }
}
