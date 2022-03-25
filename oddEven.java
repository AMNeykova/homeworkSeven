import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        System.out.println("Enter number");
        num = scanner.nextInt();
        if (num %2==0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }


    }

}