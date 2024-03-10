import java.util.Scanner;

public class feladat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adjon meg egy karakterláncot: ");
        String characters = sc.next();

        StringBuilder string = new StringBuilder();
        boolean volt;

        for (int i = 0; i < characters.length(); i++) {
            volt = false;
            for (int j = 0; j < i; j++) {
                if (characters.charAt(i) == characters.charAt(j)) {
                    volt = true;
                    break;
                }
            }
            if (!volt) {
                string.append(characters.charAt(i));
            }
        }

        System.out.println(string.toString());
    }
}

