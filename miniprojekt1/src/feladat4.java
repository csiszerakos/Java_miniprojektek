import java.security.Principal;
import java.util.Scanner;

public class feladat4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Adj meg egy számot: ");
        int i = sc.nextInt();
        int y = 1;
        while (y <= i) {
            int j = 1;
            while (j <= y) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            y++;
        }
    }
}
