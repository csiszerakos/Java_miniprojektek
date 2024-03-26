public class HorrorFilm extends Film implements IKorhataros {

    private int korh;

    public HorrorFilm(String cim, int ar, int korh) {
        super(cim, ar);
        this.korh = korh;
    }

    @Override
    public int getKorhatar() {
        return korh;
    }

    @Override
    public int Buntetes(int kor) {
        int kulonbseg = Math.abs(kor - korh);
        return kulonbseg > 0 ? kulonbseg * getAr() : 0;
    }

    @Override
    public String toString() {
        return String.format("Film cime: %s, Film ara: %d, Korhatar: %d", cim, ar, korh);
    }
}
