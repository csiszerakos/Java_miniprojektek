import java.util.Scanner;

public class feladat3 {
    public static void main(String[] args) {
        int c = 0;
        while (!(c == 5)) {
            Scanner num1 = new Scanner(System.in);
            System.out.print("Adja meg az első számot: ");
            int x = num1.nextInt();
            Scanner num2 = new Scanner(System.in);
            System.out.print("Adja meg a második számot: ");
            int y = num2.nextInt();
            System.out.println("1 - összeadás");
            System.out.println("2 - kivonás");
            System.out.println("3 - szorzás");
            System.out.println("4 - osztás");
            System.out.println("5 - kilépés");
            System.out.print("Adja meg a műveletet: ");
            Scanner op = new Scanner(System.in);
            c = op.nextInt();
            if (c == 1) {
                System.out.println("Eredmény: " + (x + y));
            }
            if (c == 2) {
                System.out.println("Eredmény: " + (x - y));
            }
            if (c == 3) {
                System.out.println("Eredmény: " + (x * y));
            }
            if (c == 4) {
                System.out.println("Eredmény: " + (x / y));
            }
            if (c == 5) {
                System.out.println("Kilépés");
            }
            if(c<1 || 5<c){
                System.out.println("Hibás múvelet!");
            }
        }

    }
}
