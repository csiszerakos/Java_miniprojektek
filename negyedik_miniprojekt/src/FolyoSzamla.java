import java.util.Objects;

public class FolyoSzamla extends RegularisSzamla {

    private int tranzakciokSzama;
    private static final int ingyenesTranzakciokSzama = 3;
    private static final double tranzakcioAra = 2.0;

    private double egyenleg = getEgyenleg();

    public FolyoSzamla(String tulNev) {
        super(tulNev);
        this.tranzakciokSzama = 0;
    }

    @Override
    public double betesz(double osszeg) {
        tranzakciokSzama++;
        super.betesz(osszeg);
        return egyenleg;
    }

    @Override
    public double kivesz(double osszeg) {
        tranzakciokSzama++;
        super.kivesz(osszeg);
        return egyenleg;
    }

    public void levonKoltseg() {
        if (tranzakciokSzama > ingyenesTranzakciokSzama) {
            double levonando = tranzakciokSzama * (tranzakciokSzama - ingyenesTranzakciokSzama) * tranzakcioAra;
            egyenleg -= levonando;
            tranzakciokSzama = 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FolyoSzamla that = (FolyoSzamla) o;
        return super.equals(o) &&
                tranzakciokSzama == that.tranzakciokSzama;
    }
}