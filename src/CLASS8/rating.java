package CLASS8;

import java.util.Scanner;

public class rating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double rating=sc.nextDouble();
        String review="any";
        if (rating>=0.0&&rating<=2.0){
            review=("Flop");
        }else if (rating>=2.1&&rating<=3.4){
            review=("Semi-hit");
    }else if (rating>=3.5&&rating<=4.5){
            review=("Hit");
}else if (rating>=4.6&&rating<=5.0) {
            review=("Super hit");
        }
        System.out.println(review);
    }
}