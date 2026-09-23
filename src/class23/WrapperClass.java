package class23;

import java.util.Arrays;
import java.util.Scanner;

public class WrapperClass {
    public static void main(String[] args) {
        int a=5;//primitive data type
        Integer b=6;//primitive data type to object and auto boxing
        System.out.println(a+b);//auto unboxing of b from objet to primitive data type
        int arr[]=new int[5];
        System.out.println(Arrays.toString(arr));
        Integer ar[]=new Integer[5];
        System.out.println(Arrays.toString(ar));
        Byte b1=23;
        Short b2=25;
        Long c3=46899888L;
        Double d2=5.4567;
        Float c=2.3f;
        Character d='j';
        Boolean k=true;
    }
}
