import java.util.Objects;

public class TakarekSzamla extends RegularisSzamla {

    private double kamatRata;
    private double egyenleg = getEgyenleg();

    public TakarekSzamla(String tulNev, double kamatRata) {
        super(tulNev);
        this.kamatRata = kamatRata;
    }

    public void hozzaadKamat() {
        egyenleg += egyenleg * kamatRata / 100;
    }

    public double getKamatRata()
    {
        return kamatRata;
    }

    public void setKamatRata(double kamat)
    {
        this.kamatRata = kamat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TakarekSzamla that = (TakarekSzamla) o;
        return super.equals(o) &&
                Double.compare(kamatRata, that.kamatRata) == 0;
    }

}
