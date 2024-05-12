public class Jegy {

    private final String tantargyNev;
    private final int jegy;

    public Jegy(String tantargyNev, int jegy) {
        this.tantargyNev = tantargyNev;
        this.jegy = jegy;
    }

    public String getTantargyNev() {
        return tantargyNev;
    }

    public int getJegy() {
        return jegy;
    }

    @Override
    public String toString() {
        return tantargyNev + ": " + jegy;
    }
}
