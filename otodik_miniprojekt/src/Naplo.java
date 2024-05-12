import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Naplo {

    private final List<Hallgato> hallgatok;

    public Naplo(String csvFajlNev) {
        hallgatok = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(csvFajlNev))) {
            String sor;
            while ((sor = reader.readLine()) != null) {
                String[] adatok = sor.split(",");
                String vezeteknev = adatok[0];
                String keresztnev = adatok[1];
                Hallgato hallgato = new Hallgato(vezeteknev, keresztnev);
                hallgatok.add(hallgato);
            }
        } catch (IOException e) {
            System.err.println("Hiba a fájl beolvasásakor: " + e.getMessage());
        }
    }

    public void listazNevek() {
        for (int i = 0; i < hallgatok.size(); i++) {
            Hallgato hallgato = hallgatok.get(i);
            System.out.println((i + 1) + ". " + hallgato.getVezeteknev() + " " + hallgato.getKeresztnev());
        }
    }

    public void ujJegy(int hallgatoId, Jegy jegy) {
        for (Hallgato hallgato : hallgatok) {
            if (hallgato.getId() == hallgatoId) {
                hallgato.ujBejegyzes(jegy);
                return;
            }
        }
        System.err.println("A megadott hallgató ID nem található: " + hallgatoId);
    }

    public void listazHallgatoiAdatok() {
        for (Hallgato hallgato : hallgatok) {
            System.out.println(hallgato.getVezeteknev() + " " + hallgato.getKeresztnev());
            for (String tantargy : hallgato.getTantargyak()) {
                System.out.println(tantargy + ": " + hallgato.tantargyAtlag(tantargy));
            }
            System.out.println();
        }
    }
}

