import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter three sides of the triangle");
        int sideX = scanner.nextInt();
        int sideY = scanner.nextInt();
        int sideZ = scanner.nextInt();

        boolean isEquilateral = sideX==sideY && sideY==sideZ && sideX==sideZ;
        boolean isIsosceles = sideX==sideY || sideY==sideZ || sideX==sideZ;
        boolean isVersatile = sideX!=sideY && sideY!=sideZ && sideX!=sideZ;

        if (isEquilateral) {
            System.out.println("Equilateral triangle");
        } else if (isIsosceles) {
            System.out.println("Isosceles triangle");
        } else if (isVersatile) {
            System.out.println("Versatile triangle");
        }

    }
}
