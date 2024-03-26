import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Teszter {

    private static final int FILM_SZAM = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Film> filmek = new ArrayList<>();

        for (int i = 0; i < FILM_SZAM; i++) {
            System.out.println("Film " + (i + 1) + " adatai:");
            System.out.print("Cím: ");
            String cim = scanner.nextLine();
            System.out.print("Ár: ");
            int ar = scanner.nextInt();
            scanner.nextLine();

            if (i % 2 == 0) {
                System.out.print("Korhatár: ");
                int korhatar = scanner.nextInt();
                scanner.nextLine();
                filmek.add(new HorrorFilm(cim, ar, korhatar));
            } else {
                filmek.add(new Film(cim, ar));
            }
        }

        System.out.println("\nFilmek listája :");
        for (Film film : filmek) {
            System.out.println(film);
        }

        filmek.sort((f1, f2) -> f1.getAr() - f2.getAr());

        System.out.println("\nRendezett lista ár szerint :");
        for (Film film : filmek) {
            System.out.println(film);
        }

        IKorhataros[] korhatarosFilmek = new IKorhataros[3];
        int k = 0;
        for (Film film : filmek) {
            if (film instanceof HorrorFilm) {
                korhatarosFilmek[k++] = (HorrorFilm) film;
            }
        }

        System.out.println("\nHorrorFilm-ek listája :");
        for (IKorhataros film : korhatarosFilmek) {
            System.out.println(film);
        }

        System.out.println("\nBüntetés kiszámítása :");
        System.out.print("Életkor: ");
        int eletkor = scanner.nextInt();

        int osszesBuntetes = 0;
        for (IKorhataros film : korhatarosFilmek) {
            osszesBuntetes += film.Buntetes(eletkor);
        }

        System.out.println("Összes büntetés: " + osszesBuntetes);
    }
}
