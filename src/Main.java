import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        try {
            Appuntamento appuntamento1 = new Appuntamento(OffsetDateTime.parse("2023-03-01T13:00:00Z"), "visita1", "nota1");
            Appuntamento appuntamento2 = new Appuntamento(OffsetDateTime.parse("2023-03-01T13:00:00Z"), "visita2", "nota2");
            Appuntamento appuntamento3 = new Appuntamento(OffsetDateTime.parse("2023-03-01T13:00:00Z"), "visita3", "nota3");

            Appuntamento nuovoAppuntamento = new Appuntamento(OffsetDateTime.parse("2023-03-01T13:00:00Z"), "visita medica", "nota1");

            GestioneAppuntamenti gestioneAppuntamenti = new GestioneAppuntamenti();

            gestioneAppuntamenti.addAppuntamento((appuntamento1));
            gestioneAppuntamenti.addAppuntamento((appuntamento2));
            gestioneAppuntamenti.addAppuntamento((appuntamento3));

            gestioneAppuntamenti.addAppuntamento(nuovoAppuntamento);

            gestioneAppuntamenti.removeAppuntamento(nuovoAppuntamento);

        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
