import java.util.ArrayList;
import java.util.List;

public class Hallgato {

    private static int nextId = 1;
    private final int id;
    private final String vezeteknev;
    private final String keresztnev;
    private final List<Jegy> jegyek;

    public Hallgato(String vezeteknev, String keresztnev) {
        this.id = nextId++;
        this.vezeteknev = vezeteknev;
        this.keresztnev = keresztnev;
        this.jegyek = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getVezeteknev() {
        return vezeteknev;
    }

    public String getKeresztnev() {
        return keresztnev;
    }

    public void ujBejegyzes(Jegy jegy) {
        jegyek.add(jegy);
    }

    public double tantargyAtlag(String tantargyNev) {
        double osszeg = 0;
        int darab = 0;
        for (Jegy jegy : jegyek) {
            if (jegy.getTantargyNev().equals(tantargyNev)) {
                osszeg += jegy.getJegy();
                darab++;
            }
        }
        return darab == 0 ? 0 : osszeg / darab;
    }

    public List<String> getTantargyak() {
        List<String> tantargyak = new ArrayList<>();
        for (Jegy jegy : jegyek) {
            if (!tantargyak.contains(jegy.getTantargyNev())) {
                tantargyak.add(jegy.getTantargyNev());
            }
        }
        return tantargyak;
    }

    public void listazas() {
        System.out.println(vezeteknev + " " + keresztnev);
        for (String tantargy : getTantargyak()) {
            System.out.println(tantargy + ": " + tantargyAtlag(tantargy));
        }
    }
}
