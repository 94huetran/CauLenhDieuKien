import java.util.Scanner;
public class NamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nam nay la : ");
        year = scanner.nextInt();
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year%4 == 0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100 = year%100 == 0;
            if(isDivisibleBy100){
                boolean isDivisible400 = year%400 == 0;
                if (isDivisible400){
                    isLeapYear = true;
                }
            } else { isLeapYear = true;
            }

        }
        if(isLeapYear){
            System.out.printf("%d is the leap year",year);
        }else{
            System.out.printf("%d is not the leap year", year);
        }
    }
}
