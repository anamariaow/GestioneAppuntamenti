import java.time.OffsetDateTime;

public class Appuntamento {
    private OffsetDateTime data;
    private String titolo;
    private String note;

    public Appuntamento(OffsetDateTime data, String titolo, String note) {
        this.data = data;
        this.titolo = titolo;
        this.note = note;
    }

    public OffsetDateTime getData() {
        return data;
    }

    public void setData(OffsetDateTime data) {
        this.data = data;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    public void stampaAppuntamento() {

    }

    @Override
    public String toString() {
        return "Appuntamento: " +
                "data: " + data +
                ", titolo: '" + titolo + '\'' +
                ", note: '" + note + '\'' +
                '}';
    }
}
