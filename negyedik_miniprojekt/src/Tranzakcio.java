import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tranzakcio {

    private LocalDateTime idopont;
    private TranzakcioTipus tranzTipus;
    private double osszeg;

    public Tranzakcio(TranzakcioTipus tranzTipus, double osszeg) {
        this.idopont = LocalDateTime.now();
        this.tranzTipus = tranzTipus;
        this.osszeg = osszeg;
    }

    @Override
    public String toString() {
        return "Időpont: " + idopont.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")) + ", Tranzakció típusa: " + tranzTipus + ", Összeg: " + osszeg;
    }

    public LocalDateTime getIdopont() {
        return idopont;
    }

    public TranzakcioTipus getTranzTipus() {
        return tranzTipus;
    }

    public double getOsszeg() {
        return osszeg;
    }

    public void setIdopont(LocalDateTime idopont) {
        this.idopont = idopont;
    }

    public void setTranzTipus(TranzakcioTipus tranzTipus) {
        this.tranzTipus = tranzTipus;
    }

    public void setOsszeg(double osszeg) {
        this.osszeg = osszeg;
    }
}
