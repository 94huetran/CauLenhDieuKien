import java.util.Scanner;
public class ChiSoCoThe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight, height, bmi;

        System.out.println("Can nang cua ban :");
        weight = scanner.nextDouble();

        System.out.println("Chieu cao cua ban :");
        height = scanner.nextDouble();

        System.out.println("Chi so co the cua ban la : ");
        bmi = weight/Math.pow(height,2);

        if (bmi<18)
            System.out.printf("%-20.2f%s", bmi, "underweight");
         else if (bmi<25)
            System.out.printf("%-20.2f%s", bmi, "Normal");
         else if (bmi<30)
            System.out.printf("%-20.2f%s", bmi, "overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "obese");



    }

}
