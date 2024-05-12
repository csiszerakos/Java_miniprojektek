import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Naplo naplo = new Naplo("C:\\Users\\dinoa\\IdeaProjects\\otodik_miniprojekt\\src\\hallgatok.csv");
        naplo.listazNevek();

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\dinoa\\IdeaProjects\\otodik_miniprojekt\\src\\jegyek.csv"))) {
            String sor;
            while ((sor = reader.readLine()) != null) {
                String[] adatok = sor.split(",");
                int hallgatoId = Integer.parseInt(adatok[0]);
                String tantargyNev = adatok[1];
                int jegyErtek = Integer.parseInt(adatok[2]);
                Jegy jegy = new Jegy(tantargyNev, jegyErtek);
                naplo.ujJegy(hallgatoId, jegy);
            }
        } catch (IOException e) {
            System.err.println("Hiba a jegyek fájl beolvasásakor: " + e.getMessage());
        }

        naplo.listazHallgatoiAdatok();
    }
}
