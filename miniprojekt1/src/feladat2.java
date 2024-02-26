import java.util.Scanner;

public class feladat2 {
    public static void main(String[] args) {
        String password = "Kecskebeka1234";
        int y = 0;
        while (y < 3) {
            Scanner password_try = new Scanner(System.in);
            System.out.print("Adja meg a jelszót: ");
            String i = password_try.nextLine();

            if (password.equals(i)) {
                System.out.print("A jelsző helyes");
                y = 3;
            } else {
                System.out.println("A jelszó nem helyes. ");
                y++;
            }
        }
    }
}
