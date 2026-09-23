package Class13;
import java.util.Scanner;
public class WeekdaySelector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayNumber = sc.nextInt();
        String dayname=switch (dayNumber) {
            case 1->"Monday";
            case 2->"Tuesday";
            case 3->"Wednesday";
            case 4->"Thursday";
            case 5->"Friday";
            case 6->"Saturday";
            case 7->"Sunday";
            default->"Invalid day";
        };
        System.out.print(dayname);
    }
}
