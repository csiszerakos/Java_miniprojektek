import java.util.Random;
import java.util.Scanner;

public class bonusz2 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(1000000000) + 1;
        int number=0;
        int tipp=0;
        while (number != randomNumber) {
            if (randomNumber < number) {
                System.out.println("A kitalálandó szám kisebb");
            }
            if (randomNumber > number) {
                System.out.println("A kitalálandó szám nagyobb");
            }
            System.out.print("Tippeljen: ");
            Scanner sc2 = new Scanner(System.in);
            number = sc2.nextInt();
            tipp++;

            if (randomNumber == number) {
                System.out.println("Gratulálok eltalálta a számot. A szám: " + randomNumber + ". Tippek száma: " + tipp);
            }
        }
    }
}
