package prometheus.patterns.observer;

import java.util.Observable;

public class MojaOsoba extends Observable {
    private String sprava;

    public MojaOsoba() {
    }

    public String getSprava() {
        return sprava;
    }

    public void setSprava(String sprava) {
        this.sprava = sprava;
        setChanged(); // ulozenie zmeny pre observera
        notifyObservers(sprava); // poslat do observerov spravu
    }
}
