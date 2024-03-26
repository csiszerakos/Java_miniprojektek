public class Film {

    protected String cim;
    protected int ar;
    protected int[] velemenyek = new int[20];
    private int velemenyekSzama = 0;

    public Film(String cim, int ar) {
        this.cim = cim;
        this.ar = ar;
    }

    public String getCim() {
        return cim;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public int getAr() {
        return ar;
    }

    public void Velemenyezes(int velemeny) {
        if (velemeny >= 1 && velemeny <= 5) {
            velemenyek[velemenyekSzama++] = velemeny;
        }
    }

    public double Atlag() {
        if (velemenyekSzama == 0) {
            throw new IllegalStateException("A film még nem kapott véleményt!");
        }
        double osszeg = 0;
        for (int i = 0; i < velemenyekSzama; i++) {
            osszeg += velemenyek[i];
        }
        return osszeg / velemenyekSzama;
    }

    @Override
    public String toString() {
        return String.format("Film cime: %s, Film ara: %d", cim, ar);
    }
}
