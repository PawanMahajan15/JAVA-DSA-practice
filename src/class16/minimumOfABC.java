package class16;
import java.util.Scanner;
public class minimumOfABC {
    public int minABc(int[] A, char[] B) {
        int mina = Integer.MAX_VALUE;
        int minb = Integer.MAX_VALUE;
        int minc = Integer.MAX_VALUE;
        if (A.length < 3) return A[0];
        for (int i = 0; i < A.length; i++) {
            if (B[i] == 'a') {
                mina = Math.min(mina, A[i]);
            }
            if (B[i] == 'b') {
                minb = Math.min(minb, A[i]);
            }
            if (B[i] == 'c') {
                minc = Math.min(minc, A[i]);
            }
        }
        long ans =Math.min((long)mina+minb, minc);
        return (int)ans;
    }
//        public int minABc(int[] A, char[] B) {
//        int min=0;
//        if (B.length <= 2) {
//            min=A[0];
//            for (int i = 0; i <A.length ; i++) {
//                if (A[i]<min){
//                    min=A[i];
//                }
//            }
//        }
//        else {
//            int maxA = 0;
//            int maxB = 0;
//            int maxC = 0;
//            for (int i = 0; i < B.length; i++) {
//                if (B[i] == 'a') {
//                    if (maxA < A[i]) {
//                        maxA = A[i];
//                    }
//                }
//                if (B[i] == 'b') {
//                    if (maxB < A[i]) {
//                        maxB = A[i];
//                    }
//                }
//                if (B[i] == 'c') {
//                    if (maxC < A[i]) {
//                        maxC = A[i];
//                    }
//                }
//            }
//            int minA = maxA;
//            int minB = maxB;
//            int minC = maxC;
//            for (int i = 0; i < B.length; i++) {
//                if (B[i] == 'a') {
//                    if (minA > A[i]) {
//                        minA = A[i];
//                    }
//                }
//                if (B[i] == 'b') {
//                    if (minB > A[i]) {
//                        minB = A[i];
//                    }
//                }
//                if (B[i] == 'c') {
//                    if (minC > A[i]) {
//                        minC = A[i];
//                    }
//                }
//            }
//             min = Math.min((minA + minB), minC);
//        }
//        return min;
//        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        char []chr=new char[size];
        for (int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<chr.length;i++) {
            chr[i] = sc.next().charAt(0);
        }
       minimumOfABC obj=new minimumOfABC();
      System.out.println(obj.minABc(arr,chr));
    }
}
