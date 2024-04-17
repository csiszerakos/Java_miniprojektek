import java.util.ArrayList;
import java.util.List;

public class RegularisSzamla implements Bankszamla {

    private double egyenleg;
    private String tulNev;
    private int szamlaSzam;
    private static int szamlakSzama = 0;
    private ArrayList<Tranzakcio> tranzakciok;

    public RegularisSzamla(String tulNev) {
        this.tulNev = tulNev;
        this.szamlaSzam = ujSzamlaSzam();
        this.egyenleg = 0.0;
        this.tranzakciok = new ArrayList<>();
    }

    private int ujSzamlaSzam() {
        szamlakSzama++;
        return szamlakSzama;
    }

    @Override
    public double getEgyenleg() {
        return egyenleg;
    }

    @Override
    public double betesz(double osszeg) {
        if (osszeg <= 0) {
            throw new IllegalArgumentException("Az összeg nem lehet negatív!");
        }
        egyenleg += osszeg;
        tranzakciok.add(new Tranzakcio(TranzakcioTipus.DEPOSIT, osszeg));
        return egyenleg;
    }

    @Override
    public double kivesz(double osszeg) {
        if (osszeg <= 0) {
            throw new IllegalArgumentException("Az összeg nem lehet negatív!");
        }
        if (osszeg > egyenleg) {
            throw new IllegalArgumentException("Nem elegendő az egyenleg a kért összeg kivételéhez!");
        }
        egyenleg -= osszeg;
        tranzakciok.add(new Tranzakcio(TranzakcioTipus.WITHDRAW, osszeg));

        return egyenleg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Számlaszám: ").append(szamlaSzam).append("\n");
        sb.append("Tulajdonos neve: ").append(tulNev).append("\n");
        sb.append("Egyenleg: ").append(egyenleg).append(" Ft\n");
        sb.append("Tranzakciók:\n");
        for (Tranzakcio tranzakcio : tranzakciok) {
            sb.append(tranzakcio).append("\n");
        }
        return sb.toString();
    }

    public String getTulNev()
    {
        return tulNev;
    }

    public int getSzamlaSzam()
    {
        return szamlaSzam;
    }

    public static int getSzamlakSzama()
    {
        return szamlakSzama;
    }

    public List<Tranzakcio> getTranzakciok()
    {
        return tranzakciok;
    }
}
