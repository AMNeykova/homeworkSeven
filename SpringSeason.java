import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Day");
        System.out.println("Month");
        int day = scanner.nextInt();
        int month = scanner.nextInt();

        if (day>=20 && month>=3) {
        } else if (day<=20 && month==6) {
        System.out.println("yes");
        } else {
            System.out.println("false");
        }
    }
}
