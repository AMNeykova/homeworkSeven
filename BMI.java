import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("weight");
        double weight = scanner.nextDouble();

        System.out.println("height");
        double height = scanner.nextDouble();

        double bmi = (weight/(Math.sqrt(height)));
        System.out.println("BMI"+bmi);

            if(bmi < 16) {
                System.out.println("Underweight");
            }else if (bmi < 18.5) {
                System.out.println("Normal Weight");
            }else if (bmi >= 30) {
                System.out.println("Overweight");


        }

       }
}
