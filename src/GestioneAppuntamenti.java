import java.util.ArrayList;
import java.util.HashSet;

public class GestioneAppuntamenti {
    private ArrayList<Appuntamento> appuntamentiArrayList;

    public GestioneAppuntamenti() {
        this.appuntamentiArrayList = new ArrayList<>();
    }

    public ArrayList<Appuntamento> getAppuntamentiArrayList() {
        return appuntamentiArrayList;
    }
    public void visualizzaAppuntamenti() {
        System.out.println("Appuntamenti:");
        for(Appuntamento appuntamento : appuntamentiArrayList) {
            System.out.println(appuntamento.getTitolo() + " " + appuntamento.getData() + " " + appuntamento.getNote());
        }
    }
    public void addAppuntamento(Appuntamento appuntamentoDaAggiungere) throws Exception {
        boolean isFree = true;
        for (Appuntamento appuntamentoVar : appuntamentiArrayList) {
            if (appuntamentoVar.getData().equals(appuntamentoDaAggiungere.getData())) {
                isFree = false;
            }
        }
        if (isFree) {
            appuntamentiArrayList.add(appuntamentoDaAggiungere);
        } else {
            throw new Exception("Attenzione: appuntamento duplicato");
        }
    }
    public void removeAppuntamento (Appuntamento appuntamentoDaRimuovere){
        boolean isFree = false;
        for(Appuntamento appuntamento : appuntamentiArrayList) {
            if(appuntamento.getData().equals(appuntamentoDaRimuovere)) {
                isFree = false;
            } else {
                isFree = true;
            }
        }
        if(!isFree) {
            appuntamentiArrayList.remove(appuntamentoDaRimuovere);
        }
    }
}
